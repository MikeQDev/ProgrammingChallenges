package payrollproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PayRollProject {

    public static void main(String[] args) {
        String name;
        DecimalFormat formatter = new DecimalFormat("$#,###,###,###,###.00");
        int id, hoursWorked;
        double grossPay, hourlyRate;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        name = keyboard.nextLine();
        System.out.print("Enter employee ID: ");
        id = keyboard.nextInt();
        PayRoll pRoll = new PayRoll(name,id);
        System.out.print("Enter hours worked: ");
        hoursWorked = keyboard.nextInt();
        pRoll.setHoursWorked(hoursWorked);
        System.out.print("Enter hourly wages: ");
        hourlyRate = keyboard.nextDouble();
        pRoll.setHourlyRate(hourlyRate);
        
        grossPay = pRoll.getGrossPay();
        
        System.out.println(name+"'s (Employee #"+id+") gross pay is "+formatter.format(grossPay));
    }

}
