package stocktransaction;

public class StockTransaction {
    
    public static void main(String[] args) {
        int shareAmount=1000;
        double commission=.02;
        
        double purchasedStock=32.87,
                boughtStock=shareAmount*purchasedStock,
                brokerPurchasePrice=boughtStock*commission,
                totalPurchasePrice=boughtStock+brokerPurchasePrice;
        double soldPrice=33.92,
                soldStock=shareAmount*soldPrice,
                brokerSoldPrice=soldStock*commission,
                totalSoldPrice=soldStock-brokerSoldPrice;
        double grandTotal=totalSoldPrice-totalPurchasePrice;
                
        
        
        System.out.println("Joe paid $"+boughtStock+" for his stocks."
                + " ($"+totalPurchasePrice+" with commission.)\n"
                + "Joe paid his broker $"+brokerPurchasePrice+" when he "
                + "bought the stock.\n");
        System.out.println("Joe sold his stock for $"+soldStock
                +" ($"+totalSoldPrice+" with commission.)\n"
                +"Joe paid $"+brokerSoldPrice+" when he sold the stock.\n");
        System.out.println("Joe made a total profit of $"+grandTotal+"."
        + " (Joe lost $"+-grandTotal+".)");
    }

}
