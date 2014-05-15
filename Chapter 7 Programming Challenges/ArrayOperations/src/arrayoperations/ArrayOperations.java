package arrayoperations;

import java.util.Scanner;

public class ArrayOperations {
    
    public static void main(String[] args) {
        int[] answers = {18,30,16,28};
        int total, highest, lowest;
        double average;
        
        total = getTotal(answers);        
        System.out.println("Total: "+total);
        average = getAverage(answers);
        System.out.println("Average: "+average);
        highest = getHighest(answers);
        System.out.println("Highest: "+highest);
        lowest = getLowest(answers);
        System.out.println("Lowest: "+lowest);
    }
    public static int getTotal(int[] array){
        int total=0;
        for(int val : array){
            total+=val;
        }
        return total;
    }
    public static double getAverage(int[] array){
        int total=0;
        for(int val : array){
            total+=val;
        }
        return (double)total/array.length;
    }
    public static int getHighest(int[] array){
        int highest=array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]>highest){
                highest=array[i];
            }
        }
        return highest;
    }
    public static int getLowest(int[] array){
        int lowest=array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]<lowest){
                lowest=array[i];
            }
        }
        return lowest;
    }
}
