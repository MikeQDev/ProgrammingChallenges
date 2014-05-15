package payroll.pkgclass.exception;

class invalidHW extends Exception{
    public invalidHW(){
        super("Invalid amount of hours worked");
    }
    public invalidHW(int i){
        super("Invalid amount of hours worked (must be between 0 and 84)");
    }
}
