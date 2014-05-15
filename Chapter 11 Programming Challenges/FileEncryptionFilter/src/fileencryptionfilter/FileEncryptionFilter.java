package fileencryptionfilter;

import javax.swing.JOptionPane;

public class FileEncryptionFilter {

    public static void main(String[] args) throws Exception {
        Encryption e = new Encryption();
        String encText, encKeyIn;
        int encKey;
        
        do{
            encText = JOptionPane.showInputDialog("Enter text to be encrypted");
        }while(encText.equals(""));
        do{
            encKeyIn = JOptionPane.showInputDialog("Enter any number for encryption key");
        }while(encKeyIn.equals(""));
        encKey = Integer.parseInt(encKeyIn);
        
        e.Encrypt(encText, encKey, "encrypted.dat");
        
        System.out.println("Data encrypted.");
        
        do{
            encKeyIn = JOptionPane.showInputDialog("Enter decryption key");
        }while(encKeyIn.equals(""));
        encKey = Integer.parseInt(encKeyIn);
        
        Decryption d = new Decryption("encrypted.dat", encKey);
        
        System.out.println("Decrypted text: "+d.getDecrypted());
        
        System.exit(0);
        
    }

}
