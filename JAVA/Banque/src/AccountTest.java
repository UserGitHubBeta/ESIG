package Banque.src;
/**
 * @author Clément Vogt
 * @version Version 1.0
 */
public class AccountTest {
    private static void testerAffichage() {
        System.out.println("\ntesterAffichage()");
        Account account1 = new Account("A1");
        System.out.println("Voici mon compte: " + account1);
    }

    private static void testerGetBalance() {
        System.out.println("\ntesterGetBalance()");
        Account a = new Account("134");
        System.out.println("Après construction, le solde devrait être 0. Obtenu: " + a.getBalance());
    }

    private static void testerCredit() {
        System.out.println("\ntesterCredit()");
        Account account1 = new Account("A1");
        account1.credit(50);
        System.out.println("Après crédit de 50 le solde devrait être de 50. Obtenu: \t" + account1.getBalance());
        account1.credit(20.5);
        System.out.println("Après crédit de 20.5 le solde devrait être de 70.5 Obtenu: \t" + account1.getBalance());
    }

    private static void testerDebit() {
        System.out.println("\ntesterDebit()");
        Account account1 = new Account("A1");
        account1.credit(75);
        System.out.println("Après crédit de 75 le solde devrait être de 75. Obtenu: \t" + account1.getBalance());
        account1.debit(50);
        System.out.println("Après débit de 50 le solde devrait être de 25. Obtenu: \t" + account1.getBalance());
        account1.debit(20.5);
        System.out.println("Après débit de 20.5 le solde devrait être de 4.5 Obtenu: \t" + account1.getBalance());
    }

    private static void testerCreditNegatif() {
        System.out.println("\ntesterCreditNegatif()");
        Account account1 = new Account("A1");
        account1.credit(50);
        System.out.println("Après crédit de 50 le solde devrait être de 50. Obtenu: \t" + account1.getBalance());
        account1.credit(-1);
        System.out.println("Après crédit de -1 le solde devrait être de 50. Obtenu: \t" + account1.getBalance());
    }

    private static void testerDebitNegatif() {
        System.out.println("\ntesterDebitNegatif()");
        Account account1 = new Account("A1");
        account1.credit(75);
        System.out.println("Après crédit de 75 le solde devrait être de 75. Obtenu: \t" + account1.getBalance());
        account1.debit(50);
        System.out.println("Après débit de 50 le solde devrait être de 25. Obtenu: \t" + account1.getBalance());
        account1.debit(-1);
        System.out.println("Après débit de -1 le solde devrait être de 25. Obtenu: \t" + account1.getBalance());
    }

    private static void testerSoldeNegatif() {
        System.out.println("\ntesterSoldeNegatif()");
        Account account1 = new Account("A1");
        account1.debit(1);
        System.out.println("Après débit de 1 le solde devrait être de 0. Obtenu: \t" + account1.getBalance());
    }

    public static void main(String[] args) {
        testerAffichage();
        testerGetBalance();
        testerCredit();
        testerDebit();
        testerCreditNegatif();
        testerDebitNegatif();
        testerSoldeNegatif();
    }
}
