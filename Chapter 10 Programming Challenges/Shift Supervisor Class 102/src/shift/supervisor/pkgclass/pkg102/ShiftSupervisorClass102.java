package shift.supervisor.pkgclass.pkg102;

import java.text.DecimalFormat;

public class ShiftSupervisorClass102 {

    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("$#,###,###.00");
        ShiftSupervisor s = new ShiftSupervisor();
        
        s.setNumber("312-F");
        s.setName("John Smith");
        s.setHireDate("06/14/2005");
        s.setBonus(550);
        s.setSalary(65000);
        
        System.out.println("Employee number: "+s.getNumber());
        System.out.println("Employee name: "+s.getName());
        System.out.println("Hire date: "+s.getHireDate());
        System.out.println("Annual bonus: "+d.format(s.getAnnualBonus()));
        System.out.println("Annual salary: "+d.format(s.getAnnualSalary()));
    }
}
