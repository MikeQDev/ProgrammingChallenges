package sum.of.string.numbers;

import java.util.Scanner;

public class SumOfStringNumbers {

    public static void main(String[] args) {
        String numbers;
        String[] tokens;
        int total=0;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a series of numbers seperated by commas: ");
        numbers = s.nextLine();
        
        tokens = numbers.split(",");
        
        for(String x : tokens){
            total+=Integer.parseInt(x);
        }
        
        System.out.println("The sum of the numbers "
                + "you entered is "+total);
        
    }

}
