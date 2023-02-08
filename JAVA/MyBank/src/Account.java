public class Account {
    
    String accountNumber;
    double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    public static void main(String[] args) throws Exception {
        Account AccountFirst = new Account("A1");
        System.out.println("Voici mon compte " + AccountFirst);
    }
}