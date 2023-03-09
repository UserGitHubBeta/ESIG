import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    ArrayList<Account> accounts;
    String nomClient;
    String prenomClient;
    double identifiantClient;
    LocalDate dateNaissance;

    public Client(double identifiantClient, String nomClient, String prenomClient, int annee, int mois, int jour) {
        this.identifiantClient = identifiantClient;
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        dateNaissance = LocalDate.of(annee, mois, jour);
        /*
         * mplémentation de la ArrayList dans le constructeur afin
         * de le faire apparaître dans les nouveaux inputs introduis
         */
        accounts = new ArrayList<Account>();
        /*
         * Appellationn de la méthode dans le constructeur situé dans le main
         * mis à disposiion
         */
    }

    // Ajout de la mention @Override pour surcharger une classe Java
    @Override
    public String toString() {
        // Modification de la date apporté
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        // Déclaration de la variable qui va modifier la chaine de caractère de la date
        String dateMiseEnForme = formatter.format(dateNaissance);

        return nomClient + " " + prenomClient + " (" + identifiantClient + ")" + " " + dateMiseEnForme;
    }

    // Créationn d'une arraylist sur la méthode getAccounts()
    /*
     * Cette méthode permet de récupérer les éléments d'une liste a partir
     * d'une donnée mise en paramètre ou bien d'un fichier
     */
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    /*
     * Création d'une méhode permettant d'ajouter les éléments un par un
     * dans la liste mis à dispotiion
     * Paramètre utilisé = account de la classe Account
     */
    public void addAccount(Account account) {
        accounts.add(account);
    }

}

class ClientTest {

    public static void main(String[] args) {
        // Utiliser la classe ClienTest avec l'addition de la méthode testerAffichage()
        ClientTest.testerAffichage();
        // Implémentaetion de la méthode sans utilisation de la classe ClientTests
        testerCompteClient();
        creerClientAvecComptes("ClientData.txt");
    }

    public static void testerAffichage() {
        Client firstClient = new Client(101, "James", "Bond", 1980, 12, 12);
        System.out.println(firstClient);
    }

    private static void testerCompteClient() {
        Client client = new Client(101, "Daniel", "Smith", 1980, 6, 5);
        Account acc1 = new Account("A1");
        client.addAccount(acc1);
        Account acc2 = new Account("A2");
        client.addAccount(acc2);
        System.out.println("Comptes: " + client.getAccounts());
    }

    public static void creerClientAvecComptes(String ClientData) {

        Client ClientMichelDoubier = new Client(102, "Michel", "Doubier", 1980, 12,
                24);
        System.out.println(ClientMichelDoubier);
        Scanner sc_client = null;
        // test de lecture du fichier
        try {
            sc_client = new Scanner(new File(ClientData));
            while (sc_client.hasNext()) {
                Account acc_Account = new Account(sc_client.nextLine());
                ClientMichelDoubier.addAccount(acc_Account);
                System.out.println(ClientMichelDoubier.getAccounts());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
 * Dans la classe Client, ajoutez un attribut nommé accounts.
 * 
 * Ajoutez un accesseur pour cet attribut.
 * 
 * Un accesseur est une méthode qui retourne la valeur d'un attribut. On le
 * nomme get suivi du nom de l'attribut avec la 1ère lettre en majuscule (voir
 * exercice 4.1.1). Donc ici ce sera getAccounts
 * 
 * Complétez le constructeur pour initialiser accounts.
 * 
 * Ajoutez une méthode nommée addAccount qui ajoute un Account passé en
 * paramètre a la liste des comptes du client.
 */