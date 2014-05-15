package excption.project;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ExcptionProject {

    public static void main(String[] args) throws Exception{
        DecimalFormat d = new DecimalFormat("$#,###,###.00");
        ProductionWorker p = new ProductionWorker();
        String input;
        
        try{
            input = JOptionPane.showInputDialog("Enter employee name");
            p.setName(input);
            input = JOptionPane.showInputDialog("Enter "+input+"'s employee number (XXX-L)");
            p.setNumber(input);
            input = JOptionPane.showInputDialog("Enter employee hire date (MM/DD/YYYY)");
            p.setHireDate(input);
            input = JOptionPane.showInputDialog("Enter employee shift\n(Day = 1, Night = 2)");
            p.setShift(Integer.parseInt(input));
            input = JOptionPane.showInputDialog("Enter employee's hourly pay rate");
            p.setPayRate(Double.parseDouble(input));
            System.out.println("Employee name: "+p.getName());
            System.out.println("Employee number: "+p.getNumber());
            System.out.println("Hire date: "+p.getHireDate());
            System.out.print("Shift: ");
            if(p.getShift()==1)
                System.out.println("Day");
            else
                System.out.println("Night");
            System.out.println("Pay rate: "+d.format(p.getPayRate()));
        }catch(InvalidEmployeeNumber|InvalidShift|InvalidPayRate e){
            System.out.println(e.getMessage());
        }
        
        

        System.exit(0);
    }

}
