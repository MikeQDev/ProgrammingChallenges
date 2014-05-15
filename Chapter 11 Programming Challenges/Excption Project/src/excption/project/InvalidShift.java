package excption.project;

class InvalidShift extends Exception {

    public InvalidShift() {
        super("Invalid shift (must be 1 or 2)");
    }

}
