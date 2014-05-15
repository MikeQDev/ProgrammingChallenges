package kineticenergy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KineticEnergy {

    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("#,###,###,###.##");
        Scanner keyboard = new Scanner(System.in);
        double mass, velocity, kineticEnergy;
        
        System.out.print("Enter mass of the object (kg): ");
        mass=keyboard.nextDouble();
        System.out.print("Enter velocity of the object (m/s): ");
        velocity=keyboard.nextDouble();
        
        kineticEnergy=kineticEnergy(mass,velocity);
        
        System.out.println("The kinetic energy of the object is "+formatter.format(kineticEnergy)+" joules.");
    }
    public static double kineticEnergy(double mass, double velocity){
        double kineticEnergy=(.5)*(mass)*(velocity*velocity);
        return kineticEnergy;
    }
}