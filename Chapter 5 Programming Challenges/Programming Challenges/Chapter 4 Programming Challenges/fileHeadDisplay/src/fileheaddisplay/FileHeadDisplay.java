package fileheaddisplay;

import java.io.*;
import java.util.Scanner;

public class FileHeadDisplay {
    
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
        //PrintWriter file = new PrintWriter(fileName);        
        Scanner fileInput=new Scanner(fileName);

        for(int i=1; i<=5; i++){
            String line=fileInput.nextLine();
            System.out.println(line);
            while(!fileInput.hasNext()){
                System.exit(0);
            }
        }
    }

}
