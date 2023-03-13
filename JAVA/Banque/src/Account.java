/**
 * @author Clément Vogt
 * @version Version 1.0
 */
public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account<accountNumber='" + accountNumber + "', balance=" + balance + ">;";
    }

    public void credit(double montant) {
        if (montant > 0) {
            balance += montant;
        } else {
            System.out.println("Seuls les montants positifs sont acceptés.");
        }
    }

    public void debit(double montant) {
        if (montant > 0) {
            double res = balance - montant;
            if (res > 0) {
                balance = res;
            } else {
                System.out.println("Le solde ne peut pas être négatif.");
            }
        } else {
            System.out.println("Seuls les montants positifs sont acceptés.");
        }
    }

    /* Utile pour version avec indexOf
    @Override
    public boolean equals(Object o) {
        Account account = (Account) o;
        return accountNumber.equals(account.accountNumber);
    }
    */
}
