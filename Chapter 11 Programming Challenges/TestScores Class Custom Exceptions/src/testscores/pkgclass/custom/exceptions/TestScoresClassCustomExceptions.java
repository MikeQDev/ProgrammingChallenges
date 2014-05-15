package testscores.pkgclass.custom.exceptions;

public class TestScoresClassCustomExceptions {

    public static void main(String[] args) throws InvalidTestScoreException {
        int[] scores = {96, 59, 88, 92, -13};
        
        
        try{
            TestScores t = new TestScores(scores);
            System.out.println("Average: "+t.getAverage()+"%");
        }catch(InvalidTestScoreException e){
            System.out.println(e.getMessage());
        }
        
        
        
    }

}
