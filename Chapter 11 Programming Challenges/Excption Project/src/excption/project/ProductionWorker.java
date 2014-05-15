package excption.project;

class ProductionWorker extends Employee{
    private int shift;
    private double payRate;
    public void setShift(int i) throws InvalidShift{
        if(i!=1 && i!=2){
            throw new InvalidShift();
        }
        shift = i;
    }
    public void setPayRate(double p) throws InvalidPayRate{
        if(p<0)
            throw new InvalidPayRate(p);
        else
            payRate = p;
    }
    public int getShift(){
        return shift;
    }
    public double getPayRate(){
        return payRate;
    }
}
