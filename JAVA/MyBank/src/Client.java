import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Client {
    String accounts;
    String nomClient;
    String prenomClient;
    String identifiantClient;
    LocalDate dateNaissance;

    public Client(String nomClient, String prenomClient, String identifiantClient, int annee, int mois, int jour) {
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.identifiantClient = identifiantClient;
        dateNaissance = LocalDate.of(annee, mois, jour);
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

    public String getAccounts() {
        return accounts;
    }

    public void addAccount(String accounts) {
        System.out.println(accounts);
    }
}

class ClientTest {
    public static void main(String[] args) {
        // Utiliser la classe ClienTest avec l'addition de la méthode testerAffichage()
        ClientTest.testerAffichage();
        // Implémentaetion de la méthode sans utilisation de la classe ClientTest
        testerAffichage();
    }

    public static void testerAffichage() {
        Client firstClient = new Client("James", "Bond", "007", 1980, 12, 12);

        for (int i = 0; i < 10; i++) {
            System.out.println("Client " + i + " " + firstClient);
        }
    }

    private static void testerCompteClient()
    {
        Client client = new Client(101,'Daniel','Smith',LocalDate.of(1980,6,5));
        Account acc1 = new Account('A1');
        client.addAccount(acc1);             
        Account acc2 = new Account('A2');
        client.addAccount(acc2);
        System.out.println('Comptes: '  + client.getAccounts());
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