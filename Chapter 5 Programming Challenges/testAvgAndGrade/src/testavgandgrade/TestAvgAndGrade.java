package testavgandgrade;

import java.util.Scanner;

public class TestAvgAndGrade {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int score, totalScore=0, testAmt=5, avg;
        char gradeLetter;
        for(int i=1; i<=testAmt; i++){
            System.out.print("Enter the score for test "+i+": ");
            score=keyboard.nextInt();
            totalScore+=score;
        }
        avg = calcAverage(totalScore);
        System.out.println("The average is "+avg+"%");
        gradeLetter = determineGrade(avg);
        System.out.println("Your letter grade is "+gradeLetter);
    }
    public static int calcAverage(int totalScore){
        int avg, testAmt=5;
        return avg=totalScore/testAmt;
    }
    public static char determineGrade(int avg){
        char gradeLetter;
        if(avg>=90){
            gradeLetter='A';
        }else if(avg>=80){
            gradeLetter='B';
        }else if(avg>=70){
            gradeLetter='C';
        }else if(avg>=60){
            gradeLetter='D';
        }else{
            gradeLetter='F';
        }
        return gradeLetter;
    }

}
