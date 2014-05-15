package population;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Population {
    private static DecimalFormat formatter = new DecimalFormat("##.##");
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int days;
        double increase, starting;
        do{
            System.out.print("Enter starting number of organisms (Minimum 2): ");
            starting=keyboard.nextDouble();
        }while(starting<2);
        System.out.print("Enter daily population increase (as decimal percentage): ");
        increase=keyboard.nextDouble();
        do{
            System.out.print("Enter amount of days they multiply (Minimum 1): ");
            days=keyboard.nextInt();
        }while(days<1);
        
        System.out.println("Starting population: "+starting);
        getPopulation(starting, increase, 0, days);
    }
    public static void getPopulation(double orgs, double perc, int startDay, int endDay){
        double currPop = (orgs*perc)+orgs;
        if(startDay<endDay){
            System.out.println("Day "+(startDay+1)+" population: "+formatter.format(currPop));
            getPopulation(currPop, perc, startDay+1, endDay);
        }
            
        
    }
}