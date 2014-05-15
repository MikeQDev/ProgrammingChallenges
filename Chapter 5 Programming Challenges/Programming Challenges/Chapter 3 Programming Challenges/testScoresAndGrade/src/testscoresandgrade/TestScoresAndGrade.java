package testscoresandgrade;

import java.util.Scanner;

public class TestScoresAndGrade {
    
    public static void main(String[] args) {
        int test1, test2, test3;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter score for test 1: ");
        test1 = input.nextInt();
        System.out.print("Enter score for test 2: ");
        test2 = input.nextInt();
        System.out.print("Enter score for test 3: ");
        test3 = input.nextInt();
        
        int average=(test1+test2+test3)/3;
        System.out.println("The average of the 3 tests is "+average+"%.");
        
        if(average>=90&&average<=100){
            System.out.println("You earned an A.");
        }else if(average<90&&average>=80){
            System.out.println("You earned a B.");
        }else if(average<80&&average>=70){
            System.out.println("You earned a C.");
        }else if(average<70&&average>=60){
            System.out.println("You earned a D.");
        }else if(average<60&&average>=0){
            System.out.println("You earned a F.");
        }else{
            System.out.println("You did not earn a grade.");
        }
        
    }

}
