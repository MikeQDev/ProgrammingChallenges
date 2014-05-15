package fishinggamesimulation;

import java.util.Scanner;

public class FishingGameSimulation {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char again='y';
        Dice f = new Dice();
        
        do{
            System.out.println("Fishing..");
            f.fish();
            f.getFish();          
            
            System.out.print("Play again? (Y/N): ");
            String againStr = keyboard.nextLine();
            again = againStr.charAt(0);
        }while(again=='Y'||again=='y');
        
        System.out.println("\nTotal points: "+f.getTotalPoints());
    }

}
