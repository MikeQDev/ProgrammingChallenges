package testscoresproject;

import java.util.Scanner;

public class TestScoresProject {
    
    public static void main(String[] args) {
        int score1, score2, score3, average;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter score for test 1: ");
        score1=keyboard.nextInt();
        System.out.print("Enter score for test 2: ");
        score2=keyboard.nextInt();
        System.out.print("Enter score for test 3: ");
        score3=keyboard.nextInt();
                
        TestScores test = new TestScores(score1,score2,score3);
        
        test.setScore1(score1);
        test.setScore2(score2);
        test.setScore3(score3);
        
        average = test.getAverage();
        
        System.out.println("Average of all tests is "+average+"%.");
        
        
    }

}
