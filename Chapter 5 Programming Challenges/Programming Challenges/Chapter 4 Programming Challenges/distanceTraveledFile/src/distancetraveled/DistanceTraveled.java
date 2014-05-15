package distancetraveled;

import java.io.*;
import java.util.Scanner;

public class DistanceTraveled {
    
    public static void main(String[] args) throws IOException {
        PrintWriter outputFile=new PrintWriter("Report.txt");
        Scanner keyboard = new Scanner(System.in);
        int distance, speed, hours, distanceTraveled;        
        
        do{
            System.out.print("Enter speed in miles: ");
            speed = keyboard.nextInt();        
            System.out.print("Enter amount of hours traveled: ");
            hours = keyboard.nextInt();
        }while(speed<=0 || hours<=0);
            distance = speed*hours;
        
        outputFile.println("Hour\tDistance Traveled");
        outputFile.println("--------------------------");
        for(int i=1; i<=hours; i++){
            distanceTraveled=distance/hours*i;
            
            outputFile.println(i+"\t\t"+distanceTraveled);
        }
        
        outputFile.close();
        System.out.println("Data saved to file.");
        
    }

}
