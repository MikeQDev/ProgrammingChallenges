package cashregisterclass;

import java.text.DecimalFormat;

class CashRegister {
    private int itemsPurchased;
    private RetailItem i;
    public CashRegister(RetailItem x, int n){
        i = new RetailItem(x);
        itemsPurchased = n;
    }
    public double getSubtotal(){
        return itemsPurchased*i.getPrice();
    }
    public double getTax(){
        return getSubtotal()*.06;
    }
    public double getTotal(){
        return getSubtotal()+getTax();
    }
    public String toString(){
        DecimalFormat d = new DecimalFormat("$#,###,##0.00");
        String str;
        str = "Subtotal: "+d.format(getSubtotal())+"\nSales Tax: "+d.format(getTax())+"\nTotal: "+d.format(getTotal());
        return str;
    }
}
