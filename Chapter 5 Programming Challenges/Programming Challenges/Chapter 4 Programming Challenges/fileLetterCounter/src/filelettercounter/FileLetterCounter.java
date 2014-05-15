package filelettercounter;

import java.io.*;
import java.util.Scanner;

public class FileLetterCounter {
    
    public static void main(String[] args) throws IOException{
        Scanner keyboard = new Scanner(System.in);
        String characterString, fileName, characterStringOriginal;
        
        System.out.print("Enter the name of a file (HINT: use inputFile.txt): ");
        fileName = keyboard.nextLine();
        
        File file = new File(fileName);
        
        if(!file.exists()){
            System.out.println("File does not exist! Exiting program.");
            System.exit(0);
        }
        
        System.out.print("Enter a character: ");
        characterStringOriginal = keyboard.nextLine();
        characterString = characterStringOriginal.toUpperCase();
        char character = characterString.charAt(0);
        
        Scanner inputFile=new Scanner(file);
        int count=0;
        while(inputFile.hasNext()){
            String lineOriginal = inputFile.nextLine();
            String line = lineOriginal.toUpperCase();
            for(int i=0; i<line.length(); i++){
                if(line.charAt(i)==character){
                    count++;
                }
            }
        }
        System.out.println("The file "+file+" contains the character '"+
                character+"' "+count+" times.");
        
        inputFile.close();
    }

}
