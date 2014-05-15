package distancetraveled;

import java.util.Scanner;

public class DistanceTraveled {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int speed, hours, distanceTraveled;        
        
        do{
            System.out.print("Enter speed in miles: ");
            speed = keyboard.nextInt();        
            System.out.print("Enter amount of hours traveled: ");
            hours = keyboard.nextInt();
        }while(speed<=0 || hours<=0);
            distance(speed,hours);
        
        System.out.println("Hour\tDistance Traveled");
        System.out.println("--------------------------");
        for(int i=1; i<=hours; i++){
            distanceTraveled=distance(speed,hours)/hours*i;
            
            System.out.println(i+"\t\t"+distanceTraveled);
        }
        
    }
    public static int distance(int speed, int hours){
        int distance = speed*hours;
        return distance;
    }

}
