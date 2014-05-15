package carpetcalculator;

import java.util.Scanner;

public class CarpetCalculator {

    public static void main(String[] args) {
        double length, width, price;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter length of room: ");
        length = s.nextDouble();
        System.out.print("Enter width of room: ");
        width = s.nextDouble();
        RoomDimension d = new RoomDimension(length, width);
        
        
        System.out.print("Enter cost per square foot of carpet: ");
        price = s.nextDouble();
        RoomCarpet c = new RoomCarpet(d, price);
        
        System.out.println(c);
        
    }

}
