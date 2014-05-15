package payrollproject;

class PayRoll {
    private String name;
    private double hourlyRate;
    private int idNum, hoursWorked;
    
    public PayRoll(String n, int i){
        name = n;
        idNum = i;
        hourlyRate=0;
        hoursWorked=0;
    }
    
    public void setHourlyRate(double h){
        hourlyRate = h;
    }
    
    public void setHoursWorked(int h){
        hoursWorked = h;
    }
    
    public int getIdNum(){
        return idNum;
    }
    
    public String getName(){
        return name;
    }
    
    public double getHourlyRate(){
        return hourlyRate;
    }
    
    public int hoursWorked(){
        return hoursWorked;
    }
    public double getGrossPay(){
        return hourlyRate*hoursWorked;
    }
}
