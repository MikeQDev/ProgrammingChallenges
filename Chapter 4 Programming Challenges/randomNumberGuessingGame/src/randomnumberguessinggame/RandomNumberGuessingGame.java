package randomnumberguessinggame;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int guess, number;
        
        number = rand.nextInt(101);
        
        System.out.println("---Random number generated---\n\n");
        
        System.out.print("Enter a guess number between 0 and 100: ");
        guess=keyboard.nextInt();
        
        while(guess!=number){
            if(guess>number){
                System.out.print("Guess is too high, try again: ");
                guess=keyboard.nextInt();
            }else{
                System.out.print("Guess is too low, try again: ");
                guess=keyboard.nextInt();
            }
        }
        System.out.println("You guessed the correct answer ("+number+").");        
    }
}
