package payroll.pkgclass.exception;

class invalidHR extends Exception{
    public invalidHR(){
        super("Invalid hourly rate");
    }
    public invalidHR(double d){
        super(d+" is an invalid hourly rate (must be between 0 and 25)");
    }
}
