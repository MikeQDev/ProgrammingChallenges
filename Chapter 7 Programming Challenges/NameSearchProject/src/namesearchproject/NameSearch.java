package namesearchproject;

import java.io.*;
import java.util.Scanner;

class NameSearch {
    private String[] girlNames, boyNames;
    public void getNames() throws IOException{
        File girlFile = new File("GirlNames.txt");
        Scanner gScan = new Scanner(girlFile);
        File boyName = new File("BoyNames.txt");
        Scanner bScan = new Scanner(boyName);
        int lengthG=0, lengthB=0;
        while(gScan.hasNext()){
            lengthG++;
            gScan.nextLine();
        }
        girlNames = new String[lengthG];
        
        while(bScan.hasNext()){
            lengthB++;
            bScan.nextLine();
        }
        boyNames = new String[lengthB];
        Scanner gRead = new Scanner(girlFile);
        for(int i=0; i<girlNames.length; i++){
            girlNames[i]=gRead.nextLine();
        }
        Scanner bRead = new Scanner(boyName);
        for(int i=0; i<boyNames.length; i++){
            boyNames[i]=bRead.nextLine();
        }
    }
    public void readNames(){
        for(int i=0; i<girlNames.length; i++){
            System.out.println(girlNames[i]);
        }
        for(int i=0; i<boyNames.length; i++){
            System.out.println(boyNames[i]);
        }
    }
    public void search(){
        Scanner keyboard = new Scanner(System.in);
        String x;
        System.out.print("Enter a name to search for: ");
        x = keyboard.nextLine();
        boolean found=false;
        if(!found){
            for(String n : girlNames){
                if(x.equalsIgnoreCase(n)){
                    System.out.println(x+" is a girl name.");
                    found=true;
                }
            }
        }
        if(!found){
            for(String n : boyNames){
                if(x.equalsIgnoreCase(n)){
                    System.out.println(x+" is a boys name.");
                    found=true;
                }
            }
        }
        if(!found){
            System.out.println("Name not found in list.");
        }
    }
}
