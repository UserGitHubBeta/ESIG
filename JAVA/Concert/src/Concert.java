import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Concert {
    private String nomArtiste;
    private LocalDate date;
    private int nbTicketVendus;
    private Salle salle;
    private boolean complet;

    // Constructeur permettant d'afficher le résultat attendu
    /* 
     * nomArtiste + Date + nbticketvendus
     */
    public Concert(String nomArtiste, LocalDate date, Salle salle) {
        this.nomArtiste = nomArtiste;
        this.date = date;
        this.salle = salle;
        nbTicketVendus = 0;
        complet = false;
    }

    // Méthode sur l'achat d'un billet
    public boolean achatBillet() {
        if (complet == true) {
            return false;
        }
        int m2Salle = ( salle.getLargeurSalle() * salle.getLongueurScene() ) - ( salle.getLargeurScene() * salle.getLongueurScene());
        int nbTicketRestant = (int)(m2Salle * salle.getVille().getNbSpecMax());

        if (nbTicketVendus >= nbTicketRestant) {
            complet = true;
            return false;
        } else {
            nbTicketVendus++;
            return true;
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("DD-MM-YYYY");
        return "Artiste : " + nomArtiste + " | Date : " + dateTimeFormatter.format(date) + " | Billets vendues " + nbTicketVendus;
    }
}