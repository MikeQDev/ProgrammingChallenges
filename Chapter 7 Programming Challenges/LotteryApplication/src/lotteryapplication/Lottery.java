package lotteryapplication;

import java.util.Random;
import java.util.Scanner;

class Lottery {
    private int[] lotteryNumbers = new int[5], yourNums = new int[5];
    public Lottery() {
        for(int index=0; index<lotteryNumbers.length; index++){
            Random rand = new Random();
            int r = rand.nextInt(9)+1;
            lotteryNumbers[index]=r;
        }
    }
    public void pickNums(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter five numbers between 1 and 9.");
        for(int i=0; i<yourNums.length; i++){
            System.out.print("Enter pick for number "+(i+1)+": ");
            yourNums[i]=keyboard.nextInt();
        }
    }
    public void getNums(){
        System.out.println("\nYour picks\tComputer picks");
        System.out.println("-------------------------------");
        for(int index=0; index<lotteryNumbers.length; index++){
            System.out.println("    "+yourNums[index]+"\t\t      "+lotteryNumbers[index]);
        }
    }
    public int compare(){
        int wins=0;
        for(int i=0; i<yourNums.length; i++){
            if(yourNums[i]==lotteryNumbers[i]){
                wins++;
            }
        }
        return wins;
    }

}
