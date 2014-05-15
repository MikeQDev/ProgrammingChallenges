package preferredcustomer.pkgclass.pkg10.pkg8;

import java.text.DecimalFormat;

class PreferredCustomer extends Customer{
    private double purchaseAmt, discountLvl;
    DecimalFormat d = new DecimalFormat("$###,###,##0.00");
    public PreferredCustomer(double a){
        
        purchaseAmt = a;
        
        if(a>=2000)
            discountLvl = .10;
        else if(a>=1500)
            discountLvl = .07;
        else if(a>=1000)
            discountLvl = .06;
        else if(a>=500)
            discountLvl = .05;
        else
            discountLvl = 0;
    }
    public String toString(){
        String str="Purchase amount: "+d.format(purchaseAmt)+"\nDiscount amount: "+(int)(discountLvl*100)+"%";
        return str;
    }
}
