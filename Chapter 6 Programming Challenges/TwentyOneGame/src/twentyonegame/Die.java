package twentyonegame;

import java.util.Random;

class Die {
    private int value;
    public void roll(){
        Random rand = new Random();
        value = rand.nextInt(6)+1;
    }
    public int getRoll(){
        return value;
    }
}
