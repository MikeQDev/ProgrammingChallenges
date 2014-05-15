package testscores.mod.pkgfor.serialization;

public class TestScoresModForSerialization {

    public static void main(String[] args) throws Exception{
        int[] array = {95, 76, 60, 49, 88, 85};
        
        try{
            TestScores t = new TestScores(array);
            t.writeScores("grade.dat");
            t.readScores("grade.dat");
            System.out.println();
            System.out.println("Average: "+t.getAverage()+"%");
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
        
      
    }
}
