import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Clément Vogt
 * @version Version 1.0
 */
public class Concert {
    private String nomArtiste;
    private LocalDate date;
    private boolean complet;
    private int nbTicketsVendus;
    private Salle salle;

    public Concert(String nomArtiste, LocalDate date, Salle salle) {
        this.nomArtiste = nomArtiste;
        this.date = date;
        this.salle = salle;
        nbTicketsVendus = 0;
        complet = false;
    }

    public boolean achatBillet() {
        if (complet == true) { return false; }
        int m2Salle = salle.getLargeurSalle() * salle.getLongueurSalle() - salle.getLargeurScene() * salle.getLongueurScene();
        int nbTricketsVendables = (int)(m2Salle * salle.getVille().getNbMaxSpectateursAuMetreCarre());
        if (nbTicketsVendus >= nbTricketsVendables) {
            complet = true;
            return false;
        } else {
            nbTicketsVendus++;
            return true;
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return "Artiste: " + nomArtiste + " | Date: " + formatter.format(date) + " | billet vendus: " + nbTicketsVendus;
    }
}
