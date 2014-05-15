package bankacc.and.savingsacc.pkgclass.pkg10.pkg9;

import java.text.DecimalFormat;

public abstract class BankAccount {
    DecimalFormat d = new DecimalFormat("$###,###,##0.00");
    private double balance, aIR, monthlyCharge=0;
    private int depositsThisMonth, withdrawalsThisMonth;
    public BankAccount(double b, double a){
        balance = b;
        aIR = a;
    }
    public void deposit(double d){
        balance+=d;
        depositsThisMonth++;
    }
    public void withdraw(double w){
        balance-=w;
        withdrawalsThisMonth++;
    }
    public void calcInterest(){
        double monthlyIR, monthlyInterest;
        monthlyIR = aIR/12;
        monthlyInterest = balance*monthlyIR;
        System.out.println("Adding interest.. ("+d.format(monthlyInterest)+")");
        balance+=monthlyInterest;
    }
    public void monthlyProcess(){
        balance-=monthlyCharge;
        System.out.println("Charging monthly process fees.. ("+d.format(monthlyCharge)+")");
        sayBalance();
        calcInterest();
        depositsThisMonth=0;
        withdrawalsThisMonth=0;
        sayBalance();
    }
    public void addMonthlyCharge(double d){
        monthlyCharge+=d;
    }
    public double getBalance(){
        return balance;
    }
    public void sayBalance(){
        System.out.println("Current balance: "+d.format(balance));
    }
    public int getDeposits(){
        return depositsThisMonth;
    }
    public int getWithdrawals(){
        return withdrawalsThisMonth;
    }
    public double getMonthlyCharge(){
        return monthlyCharge;
    }
}
