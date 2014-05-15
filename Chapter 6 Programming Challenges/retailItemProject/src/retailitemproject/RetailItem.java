package retailitemproject;

class RetailItem {
    private String description;
    private double price;
    private int unitsOnHand;
    public RetailItem(String d, int u, double p){
        description = d;
        unitsOnHand = u;
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
    public void setUnitsOnHand(int u){
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
}
