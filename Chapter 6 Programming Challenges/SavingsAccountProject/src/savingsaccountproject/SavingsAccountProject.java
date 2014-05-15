package savingsaccountproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingsAccountProject {
    
    public static void main(String[] args) {
        DecimalFormat dollar = new DecimalFormat("$###,###,###,##0.00");
        double balance, iRate, totInterest=0, interest, totalDeposit=0, totalWithdrawals=0;
        int months;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter starting balance: ");
        balance = keyboard.nextDouble();
        System.out.print("Enter annual interest rate: ");
        iRate = keyboard.nextDouble();
        System.out.print("Months account has been open for: ");
        months = keyboard.nextInt();
        System.out.println();
        
        SavingsAccount s = new SavingsAccount(balance);
        s.setInterestRate(iRate);
        
        for(int i=1; i<=months; i++){
            double deposited, withdrawed;
            
            System.out.print("Enter amount deposited for month "+i+": ");
            deposited = keyboard.nextDouble();
            s.deposit(deposited);
            totalDeposit+=deposited;
            
            System.out.print("Enter amount withdrawed for month "+i+": ");
            withdrawed =  keyboard.nextDouble();
            s.withdraw(withdrawed);
            totalWithdrawals+=withdrawed;
            
            double currBal = s.getBalance();
            
            s.addInterest();
            
            double addedInterest = s.getBalance()-currBal;
            
            totInterest+=addedInterest;
            
            //totInterest+=(s.getBalance()-balance);
            
            System.out.println();
            System.out.println("Current balance: "+dollar.format(s.getBalance()));
            System.out.println();
        }
        
        //totInterest = (s.getBalance()-balance)-(totalDeposit+totalWithdrawals);
        System.out.println("----------------------------------------\n");
        System.out.println("Ending balance: "+dollar.format(s.getBalance()));
        System.out.println("Total amount of deposits: "+dollar.format(totalDeposit));
        System.out.println("Total amount of withdrawals: "+dollar.format(totalWithdrawals));
        System.out.println("Total interest earned: "+dollar.format(totInterest));
    }

}
