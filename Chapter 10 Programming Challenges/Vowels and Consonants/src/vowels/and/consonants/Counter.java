package vowels.and.consonants;

class Counter {
    private int vowels=0, consonants=0;
    public Counter(String s){
        String str = s.toLowerCase();
        for(int i=0; i<str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='y'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
    }
    public int getVowels(){
        return vowels;
    }
    public int getConsonants(){
        return consonants;
    }
}
