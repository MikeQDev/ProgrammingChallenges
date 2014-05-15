package alphabetic.telephone.number;

class Phone {
    private char[] array;
    private String number="";
    public Phone(String str) {
        array = str.toUpperCase().toCharArray();
    }
    public String toDigits(){
        for(int i=0; i<array.length; i++){
            if(array[i]=='A'||array[i]=='B'||array[i]=='C'){
                array[i]='2';
            }else if(array[i]=='D'||array[i]=='E'||array[i]=='F'){
                array[i]='3';
            }else if(array[i]=='G'||array[i]=='H'||array[i]=='I'){
                array[i]='4';
            }else if(array[i]=='J'||array[i]=='K'||array[i]=='L'){
                array[i]='5';
            }else if(array[i]=='M'||array[i]=='N'||array[i]=='O'){
                array[i]='6';
            }else if(array[i]=='P'||array[i]=='Q'||array[i]=='R'||array[i]=='S'){
                array[i]='7';
            }else if(array[i]=='T'||array[i]=='U'||array[i]=='V'){
                array[i]='8';
            }else if(array[i]=='W'||array[i]=='X'||array[i]=='Y'||array[i]=='Z'){
                array[i]='9';
            }
        }
        for(char b : array){
            number+=Character.toString(b);
        }
        return number;
    }
}
