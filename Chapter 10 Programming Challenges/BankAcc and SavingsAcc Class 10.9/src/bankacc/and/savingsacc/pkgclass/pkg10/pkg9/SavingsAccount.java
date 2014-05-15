package bankacc.and.savingsacc.pkgclass.pkg10.pkg9;

import java.text.DecimalFormat;

class SavingsAccount extends BankAccount{
    private boolean activeStatus=true;
    DecimalFormat dollarF = new DecimalFormat("$###,###,##0.00");
    public SavingsAccount(double b, double a){
        super(b,a);
    }
    public void checkActive(){
        if(getBalance() >= 25){
            activeStatus=true;
        }else{
            activeStatus=false;
            System.out.println("WARNING: Account inactive (balance below $25.00)");
        }
    }
    public void withdraw(double w){
        if(activeStatus){
            System.out.println("Withdrawing "+dollarF.format(w)+"..");
            super.withdraw(w);
            sayBalance();
        }else{
            System.out.println("Unable to withdraw; account inactive (balance below $25.00)");
        }
        checkActive();
    }
    public void deposit(double d){
        if(activeStatus){
            System.out.println("Depositing "+dollarF.format(d)+"..");
            super.deposit(d);
            sayBalance();
        }else{
            System.out.println("Depositing "+dollarF.format(d)+"..");
            super.deposit(d);
            sayBalance();
            if(getBalance()>=25)
                System.out.println("Account active again. (Balance above $25.00)");
        }
        checkActive();
    }
    public void monthlyProcess(){
        if(getWithdrawals() > 4){
            addMonthlyCharge(getWithdrawals()-4);
        }
        super.monthlyProcess();
    }
    public boolean isActive(){
        if(activeStatus)
            return true;
        else
            return false;
    }
}
