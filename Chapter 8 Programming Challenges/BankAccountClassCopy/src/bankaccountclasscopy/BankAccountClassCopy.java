package bankaccountclasscopy;

public class BankAccountClassCopy {

    public static void main(String[] args) {
        BankAccount a = new BankAccount(400);
        System.out.println("Bank account 'a' balance: "+a.getBalance());
        System.out.println("Copying BankAccount 'a' to BankAccount 'b'...");
        BankAccount b = a.copy(a);
        System.out.println("Bank account 'b' balance: "+b.getBalance());
    }
}
