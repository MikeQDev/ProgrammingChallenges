package slotmachinesimulator;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class SlotMachineSimulator {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        DecimalFormat formatter = new DecimalFormat("$###,###,###,##0.00");
        int countCherry=0, countOrange=0, countPlum=0,
                countBell=0, countMelon=0, countBar=0;       
        char againChar;
        
        double gamble;
        
        System.out.println("Matches\t\tPrize");
        System.out.println("--------------------------");
        System.out.println("0\t\tNothing");
        System.out.println("2\t\t2X Gamble");
        System.out.println("3\t\t3X Gamble\n");
        System.out.println("Images: Cherries, Oranges, Plums, Bells, Melons, Bars\n");
        
        
        do{
        System.out.print("Enter the amount you want to enter into the slot machine: $");
        gamble = keyboard.nextDouble();
        
        System.out.println("\nYour images: ");
        
        for(int i=1; i<=3; i++){
            int wordPicker=rand.nextInt(5);
            String word="";
            switch(wordPicker){
                case 0:
                    word="Cherries";
                    countCherry++;
                    break;
                case 1:
                    word="Oranges";
                    countOrange++;
                    break;
                case 2:
                    word="Plums";
                    countPlum++;
                    break;
                case 3:
                    word="Bells";
                    countBell++;
                    break;
                case 4:
                    word="Melons";
                    countMelon++;
                    break;
                case 5:
                    word="Bars";
                    countBar++;
                    break;
            }
            if(i==1){
                System.out.print(word+"-");
            }else if(i==3){
                System.out.println("-"+word);
            }else{
                System.out.print(word);
            }            
        }
        System.out.println();
        double threeX=gamble*3, twoX=gamble*2;
        if(countCherry==3||countOrange==3||countPlum==3||countBell==3||countMelon==3||countBar==3){
            System.out.println("3X your gamble ("+formatter.format(gamble)+") is "+formatter.format(threeX));
        }else if(countCherry==2||countOrange==2||countPlum==2||countBell==2||countMelon==2||countBar==2){
            System.out.println("2X your gamble ("+formatter.format(gamble)+") is "+formatter.format(twoX));
        }else{
            System.out.println("You lost.");
        }
        
        System.out.print("\nPlay again? (Y/N): ");
        keyboard.nextLine();
        String againInput=keyboard.nextLine();
        againChar = againInput.charAt(0);
        if(againChar=='y'||againChar=='Y'){
            countCherry=0;
            countOrange=0;
            countPlum=0;
            countBell=0;
            countMelon=0;
            countBar=0;
        }
        }while(againChar=='y'||againChar=='Y');
    }

}
