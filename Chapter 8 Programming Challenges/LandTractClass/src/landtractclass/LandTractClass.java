package landtractclass;

import java.util.Scanner;

public class LandTractClass {

    public static void main(String[] args) {
        double length, width;
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("Enter the length of tract 1: ");
        length = s.nextDouble();
        System.out.print("Enter the width of tract 1: ");
        width = s.nextDouble();
        LandTract a = new LandTract(length, width);
        System.out.println(a);
        
        System.out.print("Enter the length of tract 2: ");
        length = s.nextDouble();
        System.out.print("Enter the width of tract 2: ");
        width = s.nextDouble();
        LandTract b = new LandTract(length, width);
        System.out.println(b);
        
        if(a.equals(b)){
            System.out.println("Both tracts are equal.");
        }else{
            System.out.println("The tracts are not equal.");
        }
    }

}
