package pig.latin;

class Translate {
    private String[] split;
    private String newString="";
    public Translate(String str){
        str = str.toUpperCase();
        split = str.split(" ");
        
        for(String s : split){
            StringBuilder x = new StringBuilder(s);
            x.append(x.charAt(0)+"AY");
            x.deleteCharAt(0);
            newString+=x+" ";
        }
        System.out.println(newString);
    }
}
