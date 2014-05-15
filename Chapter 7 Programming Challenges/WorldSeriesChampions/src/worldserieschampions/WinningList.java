package worldserieschampions;

import java.io.*;
import java.util.Scanner;

class WinningList {
    private String[] teams;
    public WinningList() throws IOException{
        File fName = new File("WorldSeriesWinners.txt");
        Scanner counter = new Scanner(fName);
        int total=0;
        while(counter.hasNext()){
            total++;
            counter.nextLine();
        }
        teams = new String[total];
        Scanner reader = new Scanner(fName);
        for(int i=0; i<teams.length; i++){
            teams[i]=reader.nextLine();
        }
    }
    public void search(String s){
        int wins=0;
        for(int i=0; i<teams.length; i++){
            if(s.equalsIgnoreCase(teams[i])){
                wins++;
            }
        }
        System.out.println("The "+s+" have won the world series "+wins+" time(s).");
    }
}
