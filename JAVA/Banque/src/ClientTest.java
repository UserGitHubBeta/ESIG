package Banque.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Clément Vogt
 * @version Version 1.0
 */
public class ClientTest {

    private static void testerAffichage() {
        System.out.println("\ntesterAffichage()");
        LocalDate birthdate = LocalDate.of(1980, 6, 5);
        Client client = new Client(101, "Daniel", "Smith", birthdate);
        System.out.println(client);
    }

    private static void testerCompteClient() {
        System.out.println("\ntesterCompteClient()");
        Client client = new Client(101, "Daniel", "Smith", LocalDate.of(1980, 6, 5));
        Account acc1 = new Account("A1");
        client.addAccount(acc1);
        Account acc2 = new Account("A2");
        client.addAccount(acc2);
        System.out.println("Compte:");
        ArrayList<Account> accounts = client.getAccounts();
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i));
        }
    }

    private static Client creerClientAvecComptes() {
        Client client = new Client(101, "Daniel", "Smith", LocalDate.of(1980, 6, 5));
        try {
            Scanner sc = new Scanner(new File("ClientAccountData.txt"));
            while (sc.hasNextLine()) {
                String accountNumber = sc.nextLine();
                Account account = new Account(accountNumber);
                client.addAccount(account);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return client;
    }

    private static void testerLireComptes() {
        System.out.println("\ntesterLireComptes()");
        Client client = creerClientAvecComptes();
        System.out.println("Client: " + client);
        ArrayList<Account> accounts = client.getAccounts();
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i));
        }
    }

    private static void executeFichierDesOperations(Client client, String nomFichier) {
        try {
            Scanner scLignes = new Scanner(new File(nomFichier));
            while (scLignes.hasNextLine()) {
                Scanner scElements = new Scanner(scLignes.nextLine());
                String accountNumber = scElements.next();
                String infoCreditDebit = scElements.next();
                double montant = scElements.nextDouble();
                Account account = client.getAccount(accountNumber);
                if (account != null) {
                    if (infoCreditDebit.equals("credit")) {
                        account.credit(montant);
                    } else {
                        account.debit(montant);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void testerOperations() {
        System.out.println("\ntesterOperations()");
        Client client = creerClientAvecComptes();
        executeFichierDesOperations(client, "AccountOperationData.txt");
        System.out.println(client);
        ArrayList<Account> accounts = client.getAccounts();
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i));
        }
    }

    public static void main(String[] args) {
        testerAffichage();
        testerCompteClient();
        creerClientAvecComptes();
        testerLireComptes();
        testerOperations();
    }
}
