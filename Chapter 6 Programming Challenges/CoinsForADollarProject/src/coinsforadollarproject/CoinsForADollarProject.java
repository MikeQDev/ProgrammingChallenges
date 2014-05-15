package coinsforadollarproject;

import java.text.DecimalFormat;

public class CoinsForADollarProject {
    
    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("$#,##0.00");
        double balance = 0;
        int round=1;
        Coin q = new Coin();
        Coin d = new Coin();
        Coin n = new Coin();
        
        do{
            System.out.println("Round "+round);
            System.out.println("------------");
            System.out.println("Flipping quarter..");
            q.toss();
            q.getSideUp();
            if(q.getSideUp().equalsIgnoreCase("heads")){
                System.out.println("Heads, adding 25 cents to balance.");
                balance+=.25;
            }else{
                System.out.println("Tails, adding nothing to balance.");
            }
            
            System.out.println("Flipping dime..");
            d.toss();
            d.getSideUp();
            if(d.getSideUp().equalsIgnoreCase("heads")){
                System.out.println("Heads, adding 10 cents to balance.");
                balance+=.10;
            }else{
                System.out.println("Tails, adding nothing to balance.");
                
            }
            
            System.out.println("Flipping nickel..");
            n.toss();
            n.getSideUp();
            if(n.getSideUp().equalsIgnoreCase("heads")){
                System.out.println("Heads, adding 5 cents to balance.");
                
            }
            System.out.println("Current balance: "+formatter.format(balance));
            System.out.println();
            round++;
        }while(balance<1);
        
        System.out.println();
        
        if(balance==1){
            System.out.println("You win; ending balance was $1.00.");
        }else if (balance>1){
            System.out.println("You lose; ending balance exceeded $1.00.");
        }
        
    }

}
