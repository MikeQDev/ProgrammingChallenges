package geometry.calc;

import java.util.Scanner;

public class GeometryCalc {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice=0;
        double radius, length, width, height, base;
        do{
            System.out.print("Geometry Calculator\n"
                    + "1. Calculate the Area of a Circle\n"
                    + "2. Calculate the Area of a Rectangle\n"
                    + "3. Calculate the Area of a Triangle\n"
                    + "4. Quit\n\n"
                    + "Enter your choice (1-4): ");
            choice=s.nextInt();
        }while(choice<1||choice>4);
        if(choice==1){
            System.out.print("Enter a radius: ");
            radius = s.nextDouble();
            System.out.println("Area: "+Geometry.circArea(radius));
        }else if(choice==2){
            System.out.print("Enter a length: ");
            length = s.nextDouble();
            System.out.print("Enter a width: ");
            width = s.nextDouble();
            System.out.println("Area: "+Geometry.rectArea(length,width));
        }else if(choice==3){
            System.out.print("Enter a base: ");
            base = s.nextDouble();
            System.out.print("Enter a height: ");
            height = s.nextDouble();
            System.out.println("Area: "+Geometry.triArea(base, height));
        }else if(choice==4){
            System.out.println("Exiting program..");
            System.exit(0);
        }
    }
}
