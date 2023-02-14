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

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Error: cannot credit negative amount.");
        }
    }

    public void debit(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Error: cannot debit negative amount or overdraft account.");
        }
    }
}

class AccountTest {
    public static void main(String[] args) {
        testerAffichage();
        testerGetBalance();
        testerCredit();
        testerDebit();
    }

    public static void testerGetBalance() {
        Account ClientA = new Account("007");
        System.out.println("Après construction, le solde devriat être 0. Obtenu " + ClientA.getBalance());
    }

    public static void testerCredit() {
        Account account1 = new Account("008");
        account1.credit(50);
        // "/t" permet d'aligner les éléments comme un tab
        System.out.println("Après crédit de 50 le solde devrait être de 50. Obtenu: \t" + account1.getBalance());
        account1.credit(20.5);
        System.out.println("Après crédit de 20.5 le solde devrait être de 70.5 Obtenu: \t" + account1.getBalance());
        System.out.println("\n");
    }

    public static void testerDebit() {
        System.out.println("\n");
        Account account1 = new Account("010");
        System.out.println("Après débit de 50 le solde devrait être de -50. Obtenu: \t" + account1.getBalance());
        account1.debit(50);
        System.out.println("Après crédit de 50+20.5 le solde devrait être de -70.5 Obtenu: \t" + account1.getBalance());
        account1.debit(20.5);
    }

    public static void testerAffichage() {
        Account account1 = new Account("A1");
        System.out.println("Voici mon compte: " + account1.toString());
        System.out.println();
    }

    public static void testerCreditNegatif(double amount) {
        System.out.println();
    }
}