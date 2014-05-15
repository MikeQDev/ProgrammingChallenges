package employee.and.productionworker.pkg10.pkg1;

class ProductionWorker extends Employee{
    private int shift;
    private double payRate;
    public void setShift(int i){
        if(i!=1 && i!=2){
            System.out.println("Invalid shift. Exiting program..");
            System.exit(0);
        }
        shift = i;
    }
    public void setPayRate(double p){
        payRate = p;
    }
    public int getShift(){
        return shift;
    }
    public double getPayRate(){
        return payRate;
    }
}
