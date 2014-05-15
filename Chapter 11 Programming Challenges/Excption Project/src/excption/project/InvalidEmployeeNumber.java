package excption.project;

class InvalidEmployeeNumber extends Exception{
    public InvalidEmployeeNumber(){
        super("Invalid employee number. Exiting program.");
    }
}
