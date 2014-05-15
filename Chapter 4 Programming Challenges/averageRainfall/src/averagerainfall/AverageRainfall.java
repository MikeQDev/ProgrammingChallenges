package averagerainfall;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageRainfall {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat formatter=new DecimalFormat("#,###.###");
        int years;
        double totalMonthlyFall=0, monthlyFall;
        
        do{
            System.out.print("Enter amount of years: ");
            years=keyboard.nextInt();
        }while(years<1);
        
        for(int i=1; i<=years; i++){
            System.out.println("\n---Year "+i+"---");
            for(int x=1; x<=12; x++){
                System.out.print("Enter rainfall in inches for year "
                        + i + ", month "+x+": ");
                monthlyFall=keyboard.nextDouble();
                
                totalMonthlyFall+=monthlyFall;
            }
        }    
        int totalMonths=(years*12);
        double average=totalMonthlyFall/(double)(totalMonths);
        if(average==1){
            System.out.println("\nThe total rainfall for " +totalMonths+" months is "
                +formatter.format(totalMonthlyFall)+" inches.\n");
            System.out.println("The average rainfall is "+formatter.format(average)+
                    " inches per month.");
        }else{
            System.out.println("\nThe total rainfall for " +totalMonths+" months is "
                +formatter.format(totalMonthlyFall)+" inches.\n");
            System.out.println("The average rainfall is "+formatter.format(average)+
                    " inch per month.");            
        }
    }

}
