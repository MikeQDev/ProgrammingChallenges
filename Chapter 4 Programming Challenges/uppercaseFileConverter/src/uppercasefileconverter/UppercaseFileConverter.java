package uppercasefileconverter;

import java.io.*;
import java.util.Scanner;

public class UppercaseFileConverter {
    
    public static void main(String[] args) throws IOException{
        Scanner keyboard = new Scanner(System.in);
        String userInput, userInputOut;
        
        System.out.print("Enter a file to be read (Hint: document.txt): ");
        userInput=keyboard.nextLine();
        
        File fileInputName = new File(userInput);
        if(!fileInputName.exists()){
            System.out.println("File does not exist. Exiting");
            System.exit(0);
        }
        Scanner fileInput=new Scanner(fileInputName);
        
        do{
            System.out.print("Enter a name to save the upper-case file under: ");
            userInputOut=keyboard.nextLine();
            if(userInputOut.equalsIgnoreCase(userInput)){
                System.out.println("You cannot save over the input file.");
            }
        }while(userInputOut.equalsIgnoreCase(userInput));
        
        PrintWriter outputFile=new PrintWriter(userInputOut);
        
        while(fileInput.hasNext()){
            String line=fileInput.nextLine();
            String fileString=line.toUpperCase();
            outputFile.println(fileString);
        }
        
        outputFile.close();
        System.out.println("Data successfully converted to uppercase.");
        
    }

}
