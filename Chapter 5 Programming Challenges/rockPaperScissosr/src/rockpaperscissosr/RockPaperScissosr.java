package rockpaperscissosr;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissosr {

    public static void main(String[] args) {
        String uC, cC;
        cC=computerChoice();
        uC=yourChoice();
        System.out.println("Computer's choice: "+cC);
        displayWinner(cC, uC);
    }
    public static void replay(){
        String uC, cC;
        uC=yourChoice();
        cC=computerChoice();
        System.out.println("Computer's choice: "+cC);
        displayWinner(cC,uC);        
    }
    public static String computerChoice(){
        Random rand = new Random();
        int chooser=rand.nextInt(3)+1;
        String computerChoice=Integer.toString(chooser);
        
        switch(chooser){
            case 1:
                computerChoice="Rock";
                break;
            case 2:
                computerChoice="Paper";
                break;
            case 3:
                computerChoice="Scissors";
                break;
        }
        
        return computerChoice;
    }
    public static String yourChoice(){
        Scanner keyboard = new Scanner(System.in);
        String yourChoice;
        System.out.print("Enter rock, paper, or scissors: ");
        yourChoice=keyboard.nextLine();
        if(!yourChoice.equalsIgnoreCase("Rock")&&!yourChoice.equalsIgnoreCase("Paper")
                &&!yourChoice.equalsIgnoreCase("Scissors")){
            System.out.println("You did not enter rock, paper, or scissors.");
            System.exit(0);
        }
        return yourChoice;
    }
    public static void displayWinner(String computerChoice, String yourChoice){
        if(computerChoice.equalsIgnoreCase(yourChoice)){
            System.out.println("Tie, replaying.");
            replay();
        }else if(computerChoice.equals("Rock")){
            if(yourChoice.equalsIgnoreCase("Scissors")){
                System.out.println("Computer wins.");
            }else if(yourChoice.equalsIgnoreCase("Paper")){
                System.out.println("You win.");
            }
        }else if(computerChoice.equals("Paper")){
            if(yourChoice.equalsIgnoreCase("Scissors")){
                System.out.println("You win.");
            }else if(yourChoice.equalsIgnoreCase("Rock")){
                System.out.println("Computer wins.");
            }
        }else if(computerChoice.equals("Scissors")){
            if(yourChoice.equalsIgnoreCase("Paper")){
                System.out.println("Computer wins.");
            }else if(yourChoice.equalsIgnoreCase("Rock")){
                System.out.println("You win.");
            }
        }else{
            System.out.println("ERROR.");
        }
    }

}
