package linenumbers;
import java.io.*;
import java.util.Scanner;

public class LineNumbers {
    
    public static void main(String[] args) throws IOException{
        Scanner keyboard=new Scanner(System.in);
        String userInput;
        
        System.out.print("Enter the name of a file (Hint: document.txt): ");
        userInput=keyboard.nextLine();
        
        File fileName = new File(userInput);
        
        if(!fileName.exists()){
            System.out.println("File does not exist!");
            System.exit(0);
        }
        
        Scanner fileInput = new Scanner(fileName);

        int i=0;
        
        while(fileInput.hasNext()){
            i++;
            String line=fileInput.nextLine();
            System.out.println(i+": "+line);
        }
    }

}
