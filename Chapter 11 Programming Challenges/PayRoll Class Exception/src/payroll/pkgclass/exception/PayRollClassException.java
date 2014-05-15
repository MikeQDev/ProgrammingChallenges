package payroll.pkgclass.exception;

import javax.swing.JOptionPane;

public class PayRollClassException {

    public static void main(String[] args) {
        String input, name;
        int hoursWorked, idNumber;
        double hourlyRate;
        
        try{
            
            PayRoll p = new PayRoll();
            
            input = JOptionPane.showInputDialog("Enter employee name");
            name = input;
            p.setName(name);
            
            input = JOptionPane.showInputDialog("Enter employee ID");
            idNumber = Integer.parseInt(input);
            p.setID(idNumber);
            
            input = JOptionPane.showInputDialog("Enter hours worked");
            hoursWorked = Integer.parseInt(input);
            p.setHoursWorked(hoursWorked);
            
            input = JOptionPane.showInputDialog("Enter hourly rate");
            hourlyRate = Double.parseDouble(input);
            p.setHourlyRate(hourlyRate);
            
            System.out.println("Name: "+p.getName());
            System.out.println("Hourly rate: "+p.getHourlyRate());
            System.out.println("Hours worked: "+p.getHoursWorked());
            System.out.println("Hours gross pay: "+p.getGrossPay());
            
        }catch(emptyName|invalidHR|invalidHW|invalidID e){
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        
        System.exit(0);
        
    }
}
