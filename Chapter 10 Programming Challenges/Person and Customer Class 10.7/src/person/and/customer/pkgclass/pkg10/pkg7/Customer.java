package person.and.customer.pkgclass.pkg10.pkg7;

class Customer extends Person{
    private int customerNumber;
    private boolean mailing;
    public Customer(){
    }
    public Customer(int n, boolean m){
        customerNumber = n;
        mailing = m;
    }
    public void setCustomerNumber(int n){
        customerNumber = n;
    }
    public void setMailing(boolean m){
        mailing = m;
    }
    public String getMailing(){
        String str;
        if(mailing==true)
            str = "yes";
        else
            str = "no";
        return str;
    }
    public String toString(){
        String str;
        str = "Name: "+getName()
                + "\nAddress: "+getAddress()
                + "\nPhone: "+getPhone()
                + "\nCustomer Number: "+customerNumber
                + "\nMailing list: "+getMailing();
        return str;
    }
}
