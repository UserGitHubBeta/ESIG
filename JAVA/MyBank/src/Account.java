public class Account {

    String accountNumber;
    double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public String toString() {
        return accountNumber + " , " + balance;
    }

}

class AccountTest {
    public static void main(String[] args) {
        testerAffichage();
    }

    public static void testerAffichage() {
        Account account1 = new Account("A1");
        System.out.println("Voici mon compte: " + account1.toString());
    }
}