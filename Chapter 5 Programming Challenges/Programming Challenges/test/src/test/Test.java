package test;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Test {
    
    public static void main(String[] args) throws IOException{
        double cups, ounces;
        cups = getCups();
        ounces = cupsToOunces(cups);
        displayMessage(cups,ounces);
    }
    public static double getCups(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter amount of cups: ");
        double numCups = keyboard.nextDouble();
        
        return numCups;
    }
    public static double cupsToOunces(double numCups){
        return numCups*8;
    }
    public static void displayMessage(double cups, double ounces){
        DecimalFormat formatter = new DecimalFormat("#,###,###.##");       
        System.out.println(formatter.format(cups) + " cups = "+formatter.format(ounces)+ " ounces");
    }
}