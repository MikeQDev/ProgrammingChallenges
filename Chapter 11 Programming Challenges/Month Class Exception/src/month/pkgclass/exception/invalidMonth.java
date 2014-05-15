package month.pkgclass.exception;

class InvalidMonth extends Exception{
    public InvalidMonth(int i){
        super("Month "+i+" does not exist.");
    }
}
