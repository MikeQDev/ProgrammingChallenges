package file.word.counter;

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FileWordCounter {

    public static void main(String[] args) throws IOException{
        String input = JOptionPane.showInputDialog("Enter file name (file.txt)");
        String[] words = null;
        int totalWords=0;
        File file = new File(input);
        
        if(!file.exists()){
            System.out.println("File does not exist! Exiting program..");
            System.exit(0);
        }
        
        Scanner fInput = new Scanner(file);
        Scanner fRead = new Scanner(file);
        
        System.out.print("The file reads: ");
        while(fInput.hasNext()){
            System.out.println(fInput.nextLine());
        }
        while(fRead.hasNext()){
            words = fRead.nextLine().toString().split(" ");
        }
        for(String b:words){
            totalWords++;
        }
        System.out.println("The file has "+totalWords+" words in it.");
    }

}