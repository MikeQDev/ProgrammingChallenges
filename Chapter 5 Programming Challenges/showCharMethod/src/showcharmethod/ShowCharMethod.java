package showcharmethod;

public class ShowCharMethod {

    public static void main(String[] args) {
        showChar("hello",1);
    }
    public static void showChar(String str, int num){
        char charAt = str.charAt(num);
        System.out.println(charAt);
    }
}
