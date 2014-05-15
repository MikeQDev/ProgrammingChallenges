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
        str = "SALES RECEIPT\r\nUnit Price: "+d.format(i.getPrice())+"\r\nQuantity: "+itemsPurchased+"\r\nSubtotal: "+d.format(getSubtotal())+"\r\nSales Tax: "+d.format(getTax())+"\r\nTotal: "+d.format(getTotal());
        return str;
    }
}
