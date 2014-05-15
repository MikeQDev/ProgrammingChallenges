package retailitem.exception;

class NegativePrice extends Exception{

    public NegativePrice(double p) {
        super("Error, price is negative value ("+p+")");
    }

}
