package bankacc.and.savingsacc.pkgclass.pkg10.pkg9;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class BankAccAndSavingsAccClass109 {

    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat("$###,###,##0.00");
        String balInput, intInput, input, input2;
        double sBalance, interestR;
        
        balInput = JOptionPane.showInputDialog("Enter starting balance");
        sBalance = Double.parseDouble(balInput);
        intInput = JOptionPane.showInputDialog("Enter yearly interest rate");
        interestR = Double.parseDouble(intInput);
        
        SavingsAccount s = new SavingsAccount(sBalance,interestR);
        
        System.out.println("//////////////////////////////////////////////////");
        System.out.println("//This application will stimulate a bank account");
        System.out.println("//with a yearly interest rate of "+(interestR*100)+"% and a");
        System.out.println("//starting balance of "+dF.format(sBalance)+". Each withdrawal");
        System.out.println("//over the 4th withdrawal will be an additional");
        System.out.println("//$1.00 service charge.");
        System.out.println("//////////////////////////////////////////////////");
        
        
        if(s.isActive()){
            System.out.println("Active");
        }else{
            System.out.println("Innactive");
        }
        
        do{
            
            input=null;
            input2=null;
            
            input = JOptionPane.showInputDialog("Enter d(eposit) or w(ithdraw) (-1 to quit)");
            if(Character.toUpperCase(input.charAt(0))=='D'){
                input2 = JOptionPane.showInputDialog("Enter amount to deposit");
                s.deposit(Double.parseDouble(input2));
            }else if(Character.toUpperCase(input.charAt(0))=='W'){
                input2 = JOptionPane.showInputDialog("Enter amount to withdraw");
                s.withdraw(Double.parseDouble(input2));
            }
        }while(!input.equals("-1"));
        
        s.monthlyProcess();
        
        System.exit(0);
    }

}
