package circleproject;

import java.util.Scanner;

public class CircleProject {
    
    public static void main(String[] args) {
        double circ, dia, area, radius;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the radius of a circle: ");
        radius = keyboard.nextInt();
        
        Circle c = new Circle(radius);
        c.setRadius(radius);
        
        circ = c.getCircumference();
        dia = c.getDiameter();
        area = c.getArea();
        
        System.out.println("Area:\t\t"+area);
        System.out.println("Diameter:\t"+dia);
        System.out.println("Circumference:\t"+circ);
    }

}
