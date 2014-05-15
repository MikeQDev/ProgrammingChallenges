package barchart;

import java.util.Scanner;

public class BarChart {
    
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int store1,store2,store3,store4,store5;
        
        System.out.print("Enter today's sales for store 1: ");
        store1=keyboard.nextInt();
        
        System.out.print("Enter today's sales for store 2: ");
        store2=keyboard.nextInt();
        
        System.out.print("Enter today's sales for store 3: ");
        store3=keyboard.nextInt();
        
        System.out.print("Enter today's sales for store 4: ");
        store4=keyboard.nextInt();
        
        System.out.print("Enter today's sales for store 5: ");
        store5=keyboard.nextInt();
        
        System.out.println("SALES BAR CHART");
        
        int store1Star=store1/100, store2Star=store2/100, store3Star=store3/100,
                store4Star=store4/100, store5Star=store5/100;
        
            System.out.print("Store 1: ");
            for(int x=1; x<=store1Star; x++){
                System.out.print("*");
            }
            
            System.out.print("\nStore 2: ");
            for(int x=1; x<=store2Star; x++){
                System.out.print("*");
            }
            
            System.out.print("\nStore 3: ");
            for(int x=1; x<=store3Star; x++){
                System.out.print("*");
            }
            
            System.out.print("\nStore 4: ");
            for(int x=1; x<=store4Star; x++){
                System.out.print("*");
            }
            
            System.out.print("\nStore 5: ");
            for(int x=1; x<=store5Star; x++){
                System.out.print("*");
            }
            System.out.println();
    }

}
