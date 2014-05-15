package word.separator;

import java.util.ArrayList;

class Separate {
    String newString = "";
    public Separate(StringBuilder str){
        str.setCharAt(0, Character.toUpperCase(str.charAt(0)));
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i)) && i!=0)
                newString += " "+Character.toLowerCase(str.charAt(i));
            else
                newString += Character.toString(str.charAt(i));
            Character.toUpperCase(newString.charAt(0));
        }
        System.out.println(newString);
    }
}
