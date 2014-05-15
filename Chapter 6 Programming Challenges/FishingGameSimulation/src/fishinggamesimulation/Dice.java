package fishinggamesimulation;

import java.util.Random;

class Dice {
    private int value, totalPoints=0;
    public void fish(){
        Random rand = new Random();
        value = rand.nextInt(6)+1;
    }
    public void getFish(){
        if(value==1){
            System.out.println("You caught seaweed. (1 point)");
            totalPoints+=1;
        }else if(value==2){
            System.out.println("You caught an old boot. (2 points)");
            totalPoints+=2;
        }else if(value==3){
            System.out.println("You caught a small fish. (3 points)");
            totalPoints+=3;
        }else if(value==4){
            System.out.println("You caught a medium-sized fish. (4 points)");
            totalPoints+=4;
        }else if(value==5){
            System.out.println("You caught a large fish. (5 points)");
            totalPoints+=5;
        }else if(value==6){
            System.out.println("You caught a gigantic fish. (6 points)");
            totalPoints+=6;
        }
    }
    public int getTotalPoints(){
        return totalPoints;
    }
}
