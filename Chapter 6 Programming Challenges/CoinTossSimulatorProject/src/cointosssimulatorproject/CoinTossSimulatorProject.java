package cointosssimulatorproject;

public class CoinTossSimulatorProject {
    
    public static void main(String[] args) {
        int tailsWin=0, headsWin=0;
        Coin c = new Coin();
        System.out.println("Coin is current on "+c.getSideUp().toLowerCase()+".");
        
        System.out.println("Tossing coin 20 times...\n");
        
        System.out.println("Toss #\tSide");
        System.out.println("--------------");
        for(int i=1; i<=20; i++){
            c.toss();
            System.out.println(i+"\t"+c.getSideUp());
            if(c.getSideUp().equalsIgnoreCase("Tails")){
                tailsWin++;
            }else if(c.getSideUp().equalsIgnoreCase("Heads")){
                headsWin++;
            }
        }
        System.out.println("\nHeads wins: "+headsWin);
        System.out.println("Tails wins: "+tailsWin);
    }

}
