package lettercounter;

import java.util.Scanner;

public class LetterCounter {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String string, characterString, characterStringOriginal, stringOriginal;
        char character;
        int count=0;
        System.out.print("Enter a string: ");
        stringOriginal = keyboard.nextLine();
        string = stringOriginal.toUpperCase();
        System.out.print("Enter a character: ");
        characterStringOriginal = keyboard.nextLine();
        characterString = characterStringOriginal.toUpperCase();
        character=characterString.charAt(0);
        
        
        for(int i=0; i<string.length(); i++){
            if(string.charAt(i)==character){
                count++;
            }
        }
        if(count==1){
        System.out.println("The character "+character+" appears in "
                +string+" "+count+" time.");
        }else{
            System.out.println("The character "+character+" appears in "
                +string+" "+count+" times.");
        }
    }

}
