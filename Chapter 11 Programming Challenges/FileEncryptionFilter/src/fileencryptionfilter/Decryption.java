package fileencryptionfilter;

import java.io.*;

class Decryption {
    public Decryption(String fN, int encKey) throws Exception{
        ObjectInputStream o = new ObjectInputStream(new FileInputStream(fN));
        DataOutputStream out = new DataOutputStream(new FileOutputStream("decrypted.dat"));
        String str = (String)o.readObject();
        
        char[] array = str.toCharArray();

        for(char c:array){
            out.writeChar((char)(c-encKey));
        }
        
        o.close();
    }
    public String getDecrypted() throws Exception{
        DataInputStream i = new DataInputStream(new FileInputStream("decrypted.dat"));
        boolean EOF=false;
        String decrypted = "";
        while(!EOF){
            try{
                decrypted+=i.readChar();
            }catch(EOFException e){
                EOF = true;
            }
        }
        return decrypted;
    }
}