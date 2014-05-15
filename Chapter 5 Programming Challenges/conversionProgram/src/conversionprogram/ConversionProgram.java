package conversionprogram;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversionProgram {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int choice;
        double meters;
        System.out.print("Enter a distance in meters: ");
        meters = keyboard.nextDouble();
        
        if(meters<=0){
            System.out.println("Value must be greater than 0. Exiting program.");
            System.exit(0);
        }
        
        do{
            menu();
            choice=keyboard.nextInt();
            System.out.println();
            if(choice==1){
                showKilometers(meters);
            }else if(choice==2){
                showInches(meters);
            }else if(choice==3){
                showFeet(meters);
            }
            System.out.println();
        }while(choice!=4);
        
        
    }
    public static void showKilometers(double meters){
        DecimalFormat formatter=new DecimalFormat("###,###,###,###.##########");
        double kilometers = meters*0.001;
        System.out.println(formatter.format(meters) +" meters = "+formatter.format(kilometers)+" kilometers");
    }
    public static void showInches(double meters){
        DecimalFormat formatter=new DecimalFormat("###,###,###,###.##########");
        double inches=meters*39.37;
        System.out.println(formatter.format(meters)+" meters = "+formatter.format(inches)+" inches");
    }
    public static void showFeet(double meters){
        DecimalFormat formatter=new DecimalFormat("###,###,###,###.##########");
        double feet=meters*3.281;
        System.out.println(formatter.format(meters) +" meters = "+formatter.format(feet)+" feet");
    }
    public static void menu(){
        System.out.println("1. Convert to Kilometers");
        System.out.println("2. Convert to Inches");
        System.out.println("3. Convert to Feet");
        System.out.println("4. Quit Program");
        System.out.print("Enter a choice number: ");
    }
}