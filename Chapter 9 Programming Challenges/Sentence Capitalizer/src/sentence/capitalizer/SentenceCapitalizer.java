package sentence.capitalizer;

import javax.swing.JOptionPane;

public class SentenceCapitalizer {
    
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a phrase to be capitalized.");
        System.out.println(capitalize(input));
    }
    public static String capitalize(String str){
        int position = str.indexOf(".");
        char[] array = str.toCharArray();
        String string="";
        array[0] = Character.toUpperCase(array[0]);
        while(position!=-1){
            array[position+2]=Character.toUpperCase(array[position+2]);
            position = str.indexOf(". ", position+1);  
        }
        for(char c : array)
            string+=c;
        return string;
    }
}
