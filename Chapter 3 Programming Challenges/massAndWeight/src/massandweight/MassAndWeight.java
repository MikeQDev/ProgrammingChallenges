package massandweight;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MassAndWeight {
    
    public static void main(String[] args) {
        double mass;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the mass of an object in kilograms: ");
        mass=keyboard.nextDouble();
        
        double weight=mass*9.8;
        
        DecimalFormat formatter=new DecimalFormat("#,###.##");
        
        
        System.out.printf("The weight of the object is "+formatter.format(weight)+" newtons.\n");
        
        if(weight>1000){
            System.out.println("The object is too heavy.");
        }else if(weight<10){
            System.out.println("The object is too light.");
        }
    }

}
