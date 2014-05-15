package coinsforadollarproject;

import java.util.Random;

class Coin {
    private String sideUp;
    public Coin() {
        Random rand = new Random();
        int x = rand.nextInt(2);
        if(x==0){
            sideUp="Heads";
        }else{
            sideUp="Tails";
        }
    }
    public void toss(){
        Random rand = new Random();
        int x = rand.nextInt(2);
        if(x==0){
            sideUp="Heads";
        }else{
            sideUp="Tails";
        }
    }
    public String getSideUp(){
        return sideUp;
    }

}
