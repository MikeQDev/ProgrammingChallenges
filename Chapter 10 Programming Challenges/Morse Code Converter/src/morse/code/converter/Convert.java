package morse.code.converter;

class Convert {
    private String newString="";
    public Convert(String str){
        str = str.toUpperCase();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                newString+=" ";                
            }else if(str.charAt(i)==','){
                newString+="--..-- ";
            }else if(str.charAt(i)=='.'){
                newString+=".-.-.- ";
            }else if(str.charAt(i)=='?'){
                newString+="..--.. ";
            }else if(str.charAt(i)=='0'){
                newString+="----- ";
            }else if(str.charAt(i)=='1'){
                newString+=".---- ";
            }else if(str.charAt(i)=='2'){
                newString+="..--- ";
            }else if(str.charAt(i)=='3'){
                newString+="...-- ";
            }else if(str.charAt(i)=='4'){
                newString+="....- ";
            }else if(str.charAt(i)=='5'){
                newString+="..... ";
            }else if(str.charAt(i)=='6'){
                newString+="-.... ";
            }else if(str.charAt(i)=='7'){
                newString+="--... ";
            }else if(str.charAt(i)=='8'){
                newString+="---.. ";
            }else if(str.charAt(i)=='9'){
                newString+="----. ";
            }else if(str.charAt(i)=='A'){
                newString+=".- ";
            }else if(str.charAt(i)=='B'){
                newString+="-... ";
            }else if(str.charAt(i)=='C'){
                newString+="-.-. ";
            }else if(str.charAt(i)=='D'){
                newString+="-.. ";
            }else if(str.charAt(i)=='E'){
                newString+=". ";
            }else if(str.charAt(i)=='F'){
                newString+="..-. ";
            }else if(str.charAt(i)=='G'){
                newString+="--. ";
            }else if(str.charAt(i)=='H'){
                newString+=".... ";
            }else if(str.charAt(i)=='I'){
                newString+=".. ";
            }else if(str.charAt(i)=='J'){
                newString+=".--- ";
            }else if(str.charAt(i)=='K'){
                newString+="-.- ";
            }else if(str.charAt(i)=='L'){
                newString+=".-.. ";
            }else if(str.charAt(i)=='M'){
                newString+="-- ";
            }else if(str.charAt(i)=='N'){
                newString+="-. ";
            }else if(str.charAt(i)=='O'){
                newString+="--- ";
            }else if(str.charAt(i)=='P'){
                newString+=".--. ";
            }else if(str.charAt(i)=='Q'){
                newString+="--.- ";
            }else if(str.charAt(i)=='R'){
                newString+=".-. ";
            }else if(str.charAt(i)=='S'){
                newString+="... ";
            }else if(str.charAt(i)=='T'){
                newString+="- ";
            }else if(str.charAt(i)=='U'){
                newString+="..- ";
            }else if(str.charAt(i)=='V'){
                newString+="...- ";
            }else if(str.charAt(i)=='W'){
                newString+=".-- ";
            }else if(str.charAt(i)=='X'){
                newString+="-..- ";
            }else if(str.charAt(i)=='Y'){
                newString+="-.-- ";
            }else if(str.charAt(i)=='Z'){
                newString+="--.. ";
            }
        }
        System.out.println(newString);
    }
}
