package filearray.pkgclass;

import java.io.*;

class FileArray {
    
    public static void writeArray(String fN, int[] array) throws Exception{
        DataOutputStream o = new DataOutputStream(new FileOutputStream(fN));
        
        for(int i : array)
            o.writeInt(i);
        
        o.close();
        
    }
    
    public static void readArray(String fN, int[] array) throws Exception{
        DataInputStream i = new DataInputStream(new FileInputStream(fN));
        boolean EOF = false;
        
        while(!EOF){
            try{
                for(int in=0;in<array.length; in++){
                    array[in] = i.readInt();
                }
            }catch(EOFException e){
                EOF = true;
            }
        }
    }
}
