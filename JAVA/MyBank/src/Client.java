import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
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
}