package retailitemproject;

public class RetailItemProject {

    public static void main(String[] args) {
        String getDesc1, getDesc2, getDesc3;
        int getUnits1, getUnits2, getUnits3;
        double getPrice1, getPrice2, getPrice3;
        
        RetailItem item1 = new RetailItem("Jacket",12,59.95);
        RetailItem item2 = new RetailItem("Designer Jeans",40,34.95);
        RetailItem item3 = new RetailItem("Shirt",20,24.95);
        
        getDesc1 = item1.getDescription();
        getUnits1 = item1.getUnitsOnHand();
        getPrice1 = item1.getPrice();
        
        getDesc2 = item2.getDescription();
        getUnits2 = item2.getUnitsOnHand();
        getPrice2 = item2.getPrice();
        
        getDesc3 = item3.getDescription();
        getUnits3 = item3.getUnitsOnHand();
        getPrice3 = item3.getPrice();
        
        System.out.println("Item\tDescription\tUnits on Hand\tPrice");
        System.out.println("------------------------------------------------------");
        System.out.println("#1\t"+getDesc1+"\t\t"+getUnits1+"\t\t"+getPrice1);
        System.out.println("#2\t"+getDesc2+"\t"+getUnits2+"\t\t"+getPrice2);
        System.out.println("#3\t"+getDesc3+"\t\t"+getUnits3+"\t\t"+getPrice3);
    }

}