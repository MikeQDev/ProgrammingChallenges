package check.writer;

import java.text.DecimalFormat;
import java.util.StringTokenizer;

class ToText {
    private double dollar;
    private String txtDollar;
    private String[] tokens;
    private String[] numText = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"},
            tyNumText={"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"},
            teenNumText={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    public ToText(double d) {
        DecimalFormat formatter = new DecimalFormat("#,###,###.00");
        dollar = d;
        txtDollar = formatter.format(dollar);
        tokens = txtDollar.split("[,.]");
        System.out.println(txtDollar);
        if(dollar>=10000000){
            System.out.println("Please enter a number below 10 million..");
            System.exit(0);
        }
        for(int i=0; i<tokens.length; i++){
            if(dollar>=1000000){
                if(i==0){
                    System.out.print(numText[Integer.parseInt((Character.toString(tokens[i].charAt(0))))]+" million ");
                }
                if(i==1){
                    if(tokens[i].charAt(0)!='0'){
                        System.out.print(numText[Integer.parseInt((Character.toString(tokens[i].charAt(0))))]+" hundred ");
                        if((tokens[i].charAt(1))=='0' && tokens[i].charAt(2)=='0'){
                        }else if(tokens[i].charAt(1)=='0'){
                            System.out.print(numText[Integer.parseInt((Character.toString(tokens[i].charAt(2))))]+" ");
                        }else if(tokens[i].charAt(2)=='0'){
                            System.out.print(tyNumText[Integer.parseInt((Character.toString(tokens[i].charAt(1))))-1]+" ");
                        }else if(tokens[i].charAt(1)>'1'){
                            System.out.print(tyNumText[Integer.parseInt((Character.toString(tokens[i].charAt(1))))-1]+" ");
                            if(tokens[i].charAt(2)!='0'){
                                System.out.print(numText[Integer.parseInt((Character.toString(tokens[i].charAt(2))))]+" ");
                            }
                        }else if(tokens[i].charAt(1)=='1'){
                            System.out.print(teenNumText[Integer.parseInt((Character.toString(tokens[i].charAt(1))))]+" ");
                        }
                        System.out.print("thousand ");
                    }
                    if(tokens[i].charAt(0)=='0'&&tokens[i].charAt(1)!='0'||tokens[i].charAt(2)!='0'){
                    }
                    System.out.print("thousand ");
                }
                if(i==2){
                    if(Integer.parseInt(Character.toString(tokens[i].charAt(0)))!=0){
                        System.out.print(numText[Integer.parseInt((Character.toString(tokens[i].charAt(0))))]+" hundred ");
                    }
                    if(tokens[i].charAt(1)=='1'){
                        System.out.println(teenNumText[Integer.parseInt((Character.toString(tokens[i].charAt(2))))]+" ");
                    }else if(tokens[i].charAt(1)>1){
                        System.out.print(tyNumText[Integer.parseInt((Character.toString(tokens[i].charAt(1))))-1]+" ");
                        System.out.println(numText[Integer.parseInt((Character.toString(tokens[i].charAt(2))))]);
                    }
                    else if(tokens[i].charAt(1)=='0'){
                        System.out.println(numText[Integer.parseInt((Character.toString(tokens[i].charAt(2))))]+" ");
                    }
                }
            }
        }
    }
}