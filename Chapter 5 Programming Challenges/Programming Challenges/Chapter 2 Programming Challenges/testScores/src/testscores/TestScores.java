package testscores;

import java.util.Scanner;

public class TestScores {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the score of test 1: ");
        double test1=input.nextDouble();
        
        System.out.print("Enter the score of test 2: ");
        double test2=input.nextDouble();
        
        System.out.print("Enter the score of test 3: ");
        double test3=input.nextDouble();
        
        double total=(test1+test2+test3)/3;
        System.out.println("The average of the 3 tests is "+total+"%");
    }

}
