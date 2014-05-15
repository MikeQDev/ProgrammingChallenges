package payroll.pkgclass.exception;

class PayRoll {
    private String name;
    private double hourlyRate;
    private int idNum, hoursWorked;
    
    public PayRoll(String n, int i, int hW, double hR) throws emptyName, invalidID, invalidHW, invalidHR{
        if(n.equals(""))
            throw new emptyName();
        if(i<=0)
            throw new invalidID(i);
        if(hW<0||hW>84)
            throw new invalidHW(hW);
        if(hR<0||hR>25)
            throw new invalidHR(hR);
        name = n;
        idNum = i;
        hoursWorked=hW;
        hourlyRate=hR;
    }
    
    public PayRoll(){
        
    }
    public void setName(String n) throws emptyName{
        if(n.equals(""))
            throw new emptyName();
        else
            name = n;
    }
    public void setHourlyRate(double h) throws invalidHR{
        if(h<0||h>25)
            throw new invalidHR(h);
        else
            hourlyRate = h;
    }
    
    public void setHoursWorked(int h) throws invalidHW{
        if(h<0||h>84)
            throw new invalidHW(h);
        else
            hoursWorked = h;
    }
    public void setID(int i) throws invalidID{
        if(i<=0)
            throw new invalidID(i);
        else
            idNum = i;
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
    
    public int getHoursWorked(){
        return hoursWorked;
    }
    public double getGrossPay(){
        return hourlyRate*hoursWorked;
    }
}
