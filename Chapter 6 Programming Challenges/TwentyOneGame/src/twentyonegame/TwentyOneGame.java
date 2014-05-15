package twentyonegame;

import java.util.Scanner;

public class TwentyOneGame {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String again;
        int cRolled, uRolled, uTotal=0, cTotal=0;
        char againChar;
        Dealer c = new Dealer();
        Player p = new Player();
        
        do{
            c.roll();
            cRolled = c.getRoll();
            cTotal+=cRolled;
            
            p.roll();            
            uRolled = p.getRoll();
            System.out.println("You rolled a "+uRolled);
            uTotal+=uRolled;
            System.out.println("Your total: "+uTotal);
            if(uTotal>21){
                System.out.println("Dealer total: "+cTotal);
                System.out.println("You went over 21. You lose.");
                System.exit(0);
            }
            if(cTotal>21){
                System.out.println("Dealer total: "+cTotal);
                System.out.println("Dealer went over 21. You win.");
                System.exit(0);
            }
            System.out.print("Roll again? (Y/N): ");
            again=keyboard.nextLine();
            againChar = again.charAt(0);
        }while(againChar=='y'||againChar=='Y');
        System.out.println("Your total: "+uTotal);
        System.out.println("Dealer total: "+cTotal);
        if(cTotal>uTotal){
            System.out.println("Dealer wins.");
        }else if(uTotal>cTotal){
            System.out.println("You win.");
        }else{
            System.out.println("Draw.");
        }
    }

}
