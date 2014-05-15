package retailitem.exception;

class RetailItem {
    private String description;
    private double price;
    private int unitsOnHand;
    public RetailItem(String d, int u, double p){
        description = d;
        unitsOnHand = u;
        price = p;
    }
    public RetailItem(double p) throws NegativePrice{
        if(p<0)
            throw new NegativePrice(p);
        else
            price = p;
    }
    public RetailItem(){
    
    }
    public void setDescription(String d){
        description = d;
    }
    public void setPrice(Double p){
        price = p;
    }
    public void setUnitsOnHand(int u) throws NegativeUnits{
        if(u<0)
            throw new NegativeUnits(u);
        else
            unitsOnHand = u;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public int getUnitsOnHand(){
        return unitsOnHand;
    }
    public RetailItem(RetailItem i2){
        description = i2.description;
        price = i2.price;
        unitsOnHand = i2.unitsOnHand;
    }
}
