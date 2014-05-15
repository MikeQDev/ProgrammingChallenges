package lotteryapplication;

public class LotteryApplication {
    
    public static void main(String[] args) {
        Lottery l = new Lottery();
        l.pickNums();
        
        l.getNums();
        
        System.out.println("\nYou guessed: "+l.compare()+" correct number(s).");
        
        if(l.compare()==5){
            System.out.println("You guessed all numbers correct and you are a grand prize winner.");
        }
    }

}
