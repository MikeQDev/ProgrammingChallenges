package largestandsmallest;

import java.util.Scanner;

public class LargestAndSmallest {
    
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int numbers, quit=-99;
        
        System.out.print("Enter a number (-99 to quit): ");
        numbers=keyboard.nextInt();
        
        if(numbers==quit){
            System.out.println("Quitting...");
            System.exit(0);
        }
        
        int largest=numbers, smallest=numbers;
        
        while(numbers!=quit){
            System.out.print("Enter a number (-99 to quit): ");
            numbers=keyboard.nextInt();
            if(numbers!=quit){
                if(numbers>largest)
                    largest=numbers;
                if(numbers<smallest)
                    smallest=numbers;
            }
            
        }
        
        System.out.println("Largest number: "+largest);
        System.out.println("Smallest number: "+smallest);
        
        
    }
}
