package espgame;

import java.util.Random;
import java.util.Scanner;

public class EspGame {
    
    public static void main(String[] args) {
        String generated, yourGuess;
        int wins=0;
        
        for(int i=1; i<=10; i++){
            yourGuess = yourGuess(i);
            generated = generate();
            if(generated.equalsIgnoreCase(yourGuess)){
                System.out.println("Correct");
                wins++;
            }else{
                System.out.println("Incorrect, computers guess was "+generated+".");
            }
        }
        
        System.out.println("Total correct guesses: "+wins+".");
    }
    public static String generate(){
        Random rand = new Random();
        String color="x";
        int generated=rand.nextInt(4);
        
        if(generated==0){
            color="red";
        }else if(generated==1){
            color="green";
        }else if(generated==2){
            color="blue";
        }else if(generated==3){
            color="orange";
        }else if(generated==4){
            color="yellow";
        }
        
        return color;
    }
    public static String yourGuess(int i){
        Scanner keyboard = new Scanner(System.in);
        String yourGuess;
        System.out.print("Enter your guess for color "+i+": ");
        yourGuess=keyboard.nextLine();
        
        return yourGuess;
    }
}
