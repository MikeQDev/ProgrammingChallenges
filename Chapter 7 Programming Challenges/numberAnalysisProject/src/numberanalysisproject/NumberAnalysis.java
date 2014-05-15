package numberanalysisproject;

import java.io.*;
import java.util.Scanner;

class NumberAnalysis {
    private int[] numbers;
    public NumberAnalysis(String fN) throws IOException{
        File fName = new File(fN);
        if(!fName.exists()){
            System.out.println("File not found.");
            System.exit(0);
        }
        Scanner fInput = new Scanner(fName);
        int total=0;
        while(fInput.hasNext()){
            total++;
            fInput.nextInt();
        }
        numbers = new int[total];
        
        Scanner fInput2 = new Scanner(fName);
        while(fInput2.hasNext()){
            for(int i=0; i<numbers.length; i++){
                numbers[i]=fInput2.nextInt();
            }
        }
    }
    public void getTotal(){
        double total=0;
        for(int i : numbers){
            total+=i;
        }
        System.out.println("Total: "+total);
    }
    public void getAverage(){
        double average, total=0;
        for(int i : numbers){
            total+=i;
        }
        average=total/numbers.length;
        System.out.println("Average: "+average);
    }
    public void getHighest(){
        int highest=numbers[0];
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>highest){
                highest=numbers[i];
            }
        }
        System.out.println("Highest: "+highest);
    }
    public void getLowest(){
        int lowest=numbers[0];
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<lowest){
                lowest=numbers[i];
            }
        }
        System.out.println("Lowest: "+lowest);
    }
}
