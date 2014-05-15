package depositandwithdrawalproject;

class SavingsAccount {
    private double interestRate, balance;
    
    public SavingsAccount(double b){
        balance = b;
    }
    public void setInterestRate(double i){
        interestRate = i/12/100;
    }
    public void addInterest(){
        balance+=balance*interestRate;
    }
    public double deposit(double d){
        return balance+=d;
    }
    public double withdraw(double w){
        return balance-=w;
    }
    public double getBalance(){
        return balance;
    }
}
