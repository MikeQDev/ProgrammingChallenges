package testscores.pkgclass;

import java.text.DecimalFormat;

public class TestScoresClass {

    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("##0.##");
        int[] scores = {196, 65, 89, 84, 92, 79};
        
       try{
            TestScores t = new TestScores(scores);
            System.out.println("Average: "+f.format(t.getAverage())+"%");
        }catch(IllegalArgumentException e){
            System.out.println("Error, one score contains a negative value or is greater than 100%.");
        }
        
    }
}
