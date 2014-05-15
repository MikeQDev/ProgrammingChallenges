package sum.of.numbers;

import java.util.*;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char again='Y';
        do{
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(s.nextLine());
            System.out.println("Sum of all numbers up to "+number+" is "+sum(number));
            
            System.out.print("Count again? (Y/N): ");
            again = Character.toUpperCase(s.nextLine().charAt(0));
        }while(again=='Y');
    }
    public static int sum(int num){
        if(num>0)
            return num + sum(num-1);
        else
            return 0;
    }
}
