package sumofnumbers;

import java.util.Scanner;

public class SumOfNumbers {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number, total=0;
        
        System.out.print("Enter a positive, non-zero integer value: ");
        number = keyboard.nextInt();
        
        System.out.print("The sum of numbers ");
        
        for(int i=1; i<=number; i++){
            if(i!=number){
            System.out.print(i+", ");
        }else{
              System.out.print(" and "+i+" is ");  
            }
            total+=i;
        }
        System.out.println(total+".");
    }
}