package shift.supervisor.pkgclass.pkg102;

class ShiftSupervisor extends Employee{
    private double annualSalary, annualBonus;
    public void setSalary(double s){
        annualSalary = s;
    }
    public void setBonus(double b){
        annualBonus = b;
    }
    public double getAnnualSalary(){
        return annualSalary;
    }
    public double getAnnualBonus(){
        return annualBonus;
    }
}
