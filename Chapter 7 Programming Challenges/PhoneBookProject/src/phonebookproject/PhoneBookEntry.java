package phonebookproject;

import java.util.ArrayList;

class PhoneBookEntry {
    private String[] name=new String[5];
    private String[] number=new String[5];
    private ArrayList<String> info = new ArrayList<>();
    public void setNumbers(){
        number[0]="(456)413-8462";
        number[1]="(346)854-2318";
        number[2]="(156)324-8256";
        number[3]="(486)123-6548";
        number[4]="(465)321-8465";
    }
    public void setName(){
        name[0]="Name1";
        name[1]="Name2";
        name[2]="Name3";
        name[3]="Name4";
        name[4]="Name5";
    }
    public void makeList(){
        for(int i=0; i<name.length; i++){
            info.add(name[i]+": "+number[i]);
        }
    }
    public void read(){
        for(String x : info){
            System.out.println(x);
        }
    }
}
