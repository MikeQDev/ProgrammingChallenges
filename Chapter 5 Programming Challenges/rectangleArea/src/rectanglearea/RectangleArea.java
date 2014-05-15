package rectanglearea;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        double length, width, area;
        length = getLength();
        width = getWidth();
        area=getArea(width,length);
        displayData(area);
    }
    public static double getLength(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length = keyboard.nextDouble();
        return length;
    }
    //getWidth, getArea, displayData
    public static double getWidth(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = keyboard.nextDouble();
        return width;
    }
    public static double getArea(double width, double length){
        double area;
        return area=width*length;
    }
    public static void displayData(double area){
        DecimalFormat formatter=new DecimalFormat("#,###,###.##");
        System.out.println("The area of the rectangle is "+formatter.format(area));
    }
}
