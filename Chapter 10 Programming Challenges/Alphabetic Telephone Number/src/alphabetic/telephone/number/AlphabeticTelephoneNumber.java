package alphabetic.telephone.number;

import javax.swing.JOptionPane;

public class AlphabeticTelephoneNumber {

    public static void main(String[] args) {
        String input, digits;
        do{
            input = JOptionPane.showInputDialog("Enter a 10 digit phone number (XXX-XXX-XXXX)");
            Phone p = new Phone(input);
            digits = p.toDigits();
            if(!isValid(input)){
                System.out.println("The number you entered was not in correct format. Try again.");
            }
        }while(!isValid(input));
        System.out.println("Inputted number: "+input);
        System.out.println("Digits number: "+digits);
    }
    public static boolean isValid(String str){
        boolean valid = true;
        char[] array = str.toCharArray();
        
        if(array.length!=12){
            return false;
        }
        for(int i=0; i<3; i++){
            if(!Character.isDigit(array[i])&&!Character.isLetter(array[i])){
                return false;
            }
        }
        if(array[3]!='-'){
            return false;
        }
        if(array[7]!='-'){
            return false;
        }
        for(int i=4; i<7; i++){
            if(!Character.isDigit(array[i])&&!Character.isLetter(array[i])){
                return false;
            }
        }
        for(int i=8; i<12; i++){
            if(!Character.isDigit(array[i])&&!Character.isLetter(array[i])){
                return false;
            }
        }
        return valid;
    }
}
