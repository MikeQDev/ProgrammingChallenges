package testscores.pkgclass.custom.exceptions;

class InvalidTestScoreException extends Exception{
    public InvalidTestScoreException(int i){
        super("Invalid test score found ("+i+"%)");
    }
}
