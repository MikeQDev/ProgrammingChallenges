package payroll.pkgclass.exception;

class invalidID extends Exception{
    public invalidID(){
        super("Invalid ID");
    }
    public invalidID(int i){
        super(i+" is an invalid ID (must be >0)");
    }
}
