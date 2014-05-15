package isprime;

import java.io.*;
import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int num;
        String fileNameInput;
        
        System.out.print("Enter a file name: ");
        fileNameInput=keyboard.nextLine();
        
        File file = new File(fileNameInput);
        PrintWriter outFile = new PrintWriter(file);
        
        for(int i=1; i<=100; i++){
            if(isPrime(i)){
                outFile.println(i);
            }
        }
        outFile.close();
    }
    public static boolean isPrime(int num){
        boolean status=true;
        if(num%2==0||num%3==0)
            return status=false;
        return status;
    }
}