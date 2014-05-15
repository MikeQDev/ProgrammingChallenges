package team.leader.pkgclass.pkg103;

import java.text.DecimalFormat;

public class TeamLeaderClass103 {

    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("$#,###,##0.00");
        TeamLeader t = new TeamLeader();
        
        t.setMinTrainingHours(15);
        t.setTrainingHoursAttended(30);
        
        if(t.getTrainingHoursAttended()>=t.getMinTrainingHours())
            t.setMonthlyBonus(75);
        else
            t.setMonthlyBonus(0);
        
        t.setPayRate(15.50);
        t.setShift(1);
        
        System.out.print("Leader shift: ");
        if(t.getShift()==1)
            System.out.println("day");
        else
            System.out.println("night");
        System.out.println("Pay rate: "+d.format(t.getPayRate()));
        System.out.println("Minimum req. training hours: "+t.getMinTrainingHours());
        System.out.println("Training hours attended: "+t.getTrainingHoursAttended());
        System.out.println("Monthly bonus: "+d.format(t.getMonthlyBonus()));
    }
}
