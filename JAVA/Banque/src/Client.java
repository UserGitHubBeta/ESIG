package Banque.src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * @author Clément Vogt
 * @version Version 1.0
 */
public class Client {
    private String nom;
    private String prenom;
    private int id;
    private LocalDate birthdate;

    private ArrayList<Account> accounts;

    public Client(int id, String prenom, String nom, LocalDate birthdate) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.birthdate = birthdate;
        accounts = new ArrayList<>();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public Account getAccount(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;

        /* Utile pour version avec indexOf
        int pos = accounts.indexOf(new Account(accountNumber));
        if (pos == -1) {
            return null;
        } else {
            return accounts.get(pos);
        }
        */
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Client<id=" + id + ", nom='" + nom + "', prénom='" + prenom + "', date de naissance=" + formatter.format(birthdate) + ">";
    }


    /* Version avec l'affichage des comptes du client directement dans le toString()
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String res = "Client<id=" + id + ", nom='" + nom + "', prénom='" + prenom + "', date de naissance=" + formatter.format(birthdate) + ">";
        if (accounts.size() > 0) {
            res += "\n";
            for (int i = 0; i < accounts.size(); i++) {
                res += accounts.get(i) + "\n";
            }
        }
        return res;
    }
    */
}
