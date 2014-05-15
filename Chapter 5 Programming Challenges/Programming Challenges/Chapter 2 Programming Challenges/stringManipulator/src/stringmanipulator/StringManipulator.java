package stringmanipulator;

import java.util.Scanner;

public class StringManipulator {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter the name of your favorite city: ");
        String city = input.nextLine();        
        
        int cityChars = city.length();
        String cityUpper = city.toUpperCase();
        String cityLower = city.toLowerCase();
        char cityFirst = city.charAt(0);
        
        System.out.println("Characters: "+cityChars+"\nUpperCase: "+cityUpper+
                "\nLowerCase: "+cityLower+"\nFirst Letter: "+cityFirst);
    }

}
