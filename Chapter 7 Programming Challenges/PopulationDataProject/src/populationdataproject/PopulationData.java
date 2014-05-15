package populationdataproject;

import java.io.*;
import java.util.Scanner;

class PopulationData{
    private int[] population;
    public PopulationData() throws IOException{
        File f = new File("USPopulation.txt");
        if(!f.exists()){
            System.out.println("File not found.");
            System.exit(0);
        }
        Scanner fCount = new Scanner(f);
        int aLength=0;
        while(fCount.hasNext()){
            aLength++;
            fCount.nextInt();
        }
        population = new int[aLength];
        Scanner fIn = new Scanner(f);
        for(int i=0; i<population.length; i++){
            population[i]=fIn.nextInt();
        }
    }
    public void averageChange(){
        int first, last;
        first = population[0];
        last = population[40];
        
        double average=(double)(last-first)/population.length;
        
        System.out.println("Average annual change: "+average);
    }
    public void greatestIncrease(){
        int greatestChange=population[1]-population[0];
        int year=0;
        for(int i=1; i<population.length; i++){
            int check = population[i]-population[i-1];
            if(check > greatestChange){
                greatestChange = check;
                year = i;
            }
        }
        System.out.println("Greatest increase: "+greatestChange+ " (From year "+(1950+(year-1))+" to year "+(1950+year)+")");
    }
    public void smallestIncrease(){
        int smallestChange=population[1]-population[0];
        int year=0;
        for(int i=1; i<population.length; i++){
            int check = population[i]-population[i-1];
            if(check < smallestChange){
                smallestChange = check;
                year = i;
            }
        }
        System.out.println("Smallest increase: "+smallestChange+" (From year "+(1950+(year-1))+" to year "+(1950+year)+")");
    }
}
