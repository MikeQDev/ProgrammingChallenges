package stockcommission;

public class StockCommission {
    
    public static void main(String[] args) {
        
        int shares=600;
        double stockPrice=21.77, commission=.02, totalStockPrice=shares*stockPrice,
                totalCommission=totalStockPrice*commission,
                totalPaid=totalStockPrice+totalCommission;       
        
        System.out.println(shares+" shares at $"+stockPrice+" is $"+totalStockPrice+
                "\n"+commission+" commission of $"+totalStockPrice+" is $"+totalCommission+
                "\nThe total amount paid for all stocks is $"+totalPaid);
    }

}
