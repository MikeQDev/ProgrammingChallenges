package testscores.mod.pkgfor.serialization;

import java.io.*;

public class TestScores{
    private int total=0;
    private int[] scores, newArray;
    public TestScores(int[] array){
        scores = new int[array.length];
        for(int n=0; n<array.length; n++){
            if(array[n]<0||array[n]>100)
                throw new IllegalArgumentException("Invalid grade found (must be between 0% and 100%)");
            scores[n] = array[n];
        }
    }
    public void writeScores(String fN) throws Exception{
        ObjectOutputStream d = new ObjectOutputStream(new FileOutputStream(fN));
        d.writeObject(scores);
        d.close();
    }
    public void readScores(String fN) throws Exception{
        ObjectInputStream i = new ObjectInputStream(new FileInputStream(fN));
        newArray=null;
        
        try{
            newArray = (int[])i.readObject();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.print("Grades: ");
        for(int o:newArray)
            System.out.print(o+"% ");
        
    }
    public int[] getScores(){
        return scores;
    }
    public double getAverage(){
        int totalN=0;
        for(int n:newArray)
            totalN+=n;
        return (double)totalN/newArray.length;
    }
}
