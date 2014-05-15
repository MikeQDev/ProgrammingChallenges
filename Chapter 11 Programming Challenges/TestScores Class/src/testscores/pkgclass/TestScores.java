package testscores.pkgclass;

public class TestScores{
    private int total=0;
    private double average;
    public TestScores(int[] array) {
        for(int n : array){
            if(n<0||n>100){
                throw new IllegalArgumentException();
            }
            total+=n;
        }
        average=(double)total/array.length;
    }
    public double getAverage(){
        return average;
    }
}
