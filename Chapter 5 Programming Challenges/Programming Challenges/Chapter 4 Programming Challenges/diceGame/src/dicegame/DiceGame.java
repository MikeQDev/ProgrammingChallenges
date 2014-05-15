package dicegame;

import java.util.Random;

public class DiceGame {
    
    public static void main(String[] args) {
        Random rand = new Random();
        int cWins=0, uWins=0, ties=0;
        
        System.out.println("You\tComputer\tWinner");
        System.out.println("--------------------------------");
        for(int i=1; i<=10; i++){
            int cpuDiceGen=rand.nextInt(6), cpuDice=cpuDiceGen+1;
            int yourDiceGen=rand.nextInt(6), yourDice=yourDiceGen+1;
            System.out.print(yourDice+"\t    "+cpuDice+"\t\t");
            if(cpuDice>yourDice){
                System.out.println("Computer");
                cWins++;
            }else if(yourDice>cpuDice){
                System.out.println("You");
                uWins++;
            }else{
                System.out.println("Tie");
                ties++;
            }
        }
        System.out.println("\nComputer wins: "+cWins);
        System.out.println("Your wins: "+uWins);
        System.out.println("Ties: "+ties+"\n");
        
        if(cWins>uWins){
            System.out.println("Grand winner: Computer");
        }else if(cWins<uWins){
            System.out.println("Grand winner: You");
        }else{
            System.out.println("No grand winner; tied scores.");
        }
    }

}
