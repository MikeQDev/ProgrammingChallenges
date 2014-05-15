package fileencryptionfilter;

import java.io.*;

public class Encryption {
    private static int arrayLength;
    public static void Encrypt(String text, int encKey, String fN) throws Exception{
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(fN));
        char[] array = new char[text.length()];
        String enc="";
        for(int i=0; i<text.length(); i++){
            array[i] = (char)(text.charAt(i)+encKey);
        }
        
        for(char c : array)
            enc+=c;
        
        o.writeObject(enc);
        
        o.close();
        
    }
}
