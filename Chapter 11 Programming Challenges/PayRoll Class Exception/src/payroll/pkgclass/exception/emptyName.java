package payroll.pkgclass.exception;

class emptyName extends Exception{
    public emptyName(){
        super("Name field cannot be empty");
    }
}
