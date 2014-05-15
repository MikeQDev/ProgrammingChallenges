package speedofsound;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SpeedOfSound {
    
    public static void main(String[] args) {
        String element;
        int distance, air=1100, water=4900, steel=16400;
        double time;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter air, water, or steel: ");
        element=keyboard.nextLine();
        System.out.print("Enter a distance (ft): ");
        distance=keyboard.nextInt();
        
        DecimalFormat formatter=new DecimalFormat("#.##");
        
        if(element.equalsIgnoreCase("air")){
            time=(double)distance/air;
            System.out.println(formatter.format(time)+" seconds");
        }else if(element.equalsIgnoreCase("water")){
            time=(double)distance/water;
            System.out.println(formatter.format(time)+" seconds");
        }else if(element.equalsIgnoreCase("steel")){
            time=(double)distance/steel;
            System.out.println(formatter.format(time)+" seconds");
        }else{
            System.out.println("Error processing your request.");
        }
                
    }

}
