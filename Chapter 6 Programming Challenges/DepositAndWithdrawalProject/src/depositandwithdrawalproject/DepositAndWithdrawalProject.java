package depositandwithdrawalproject;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DepositAndWithdrawalProject {
    
    public static void main(String[] args) throws IOException {
        DecimalFormat formatter = new DecimalFormat("$###,###,###,##0.00");
        SavingsAccount s = new SavingsAccount(500);
        
        File fName = new File("Deposits.txt");
        if(!fName.exists()){
            System.out.println("File does not exist! Exiting program.");
            System.exit(0);
        }
        Scanner fileInput = new Scanner(fName);
        
        System.out.println("Starting balance: "+formatter.format(s.getBalance()));
        
        while(fileInput.hasNext()){
            double deposit = fileInput.nextDouble();
            
            System.out.println("Depositing "+formatter.format(deposit)+"..");
            s.deposit(deposit);
        }
        
        System.out.println("Current balance: "+formatter.format(s.getBalance()));
        
        File fName2 = new File("Withdrawals.txt");
        if(!fName2.exists()){
            System.out.println("File does not exist! Exiting program.");
            System.exit(0);
        }
        Scanner fileInput2 = new Scanner(fName2);
        
        while(fileInput2.hasNext()){
            double withdrawal = fileInput2.nextDouble();
            System.out.println("Depositing: "+formatter.format(withdrawal)+"..");
            s.withdraw(withdrawal);
        }
        
        System.out.println("Current balance: "+formatter.format(s.getBalance()));
        
        Scanner keyboard = new Scanner(System.in);
        double iRate;
        System.out.print("Enter annual interest rate (%): ");
        iRate = keyboard.nextDouble();
        s.setInterestRate(iRate);
        s.addInterest();
        
        System.out.println("Ending balance: "+formatter.format(s.getBalance()));
        
        System.exit(0);
    }

}
