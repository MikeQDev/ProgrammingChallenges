package twentyonegame;

public class Player {
    Die die = new Die();
    public void roll(){
        die.roll();
    }
    public int getRoll(){
        return die.getRoll();
    }
}
