package filearray.pkgclass;

import javax.swing.JOptionPane;

public class FileArrayClass {

    public static void main(String[] args) throws Exception {
        int[] array = {3, 6, 3, 7, 4, 8, 6, 4, 2, 7};
        int[] newArray = new int[array.length];
        FileArray f = new FileArray();
        
        f.writeArray("array.dat", array);
        
        
        
        f.readArray("array.dat", newArray);
        for(int i : newArray)
            System.out.println(i);            
        

    }

}
