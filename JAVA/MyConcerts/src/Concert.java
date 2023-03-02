import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Concert {
    // Importation de la classe "Salle" pour l'utiliser dans cette classe
    Salle salle;
    String nomArtiste;
    LocalDate date; // Application du format date "YYYY-MM-DD"
    boolean complet;
    int nbTicketsVendus;

    @Override
    public String toString() {
        DateTimeFormatter FormatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String NouvelleDate = FormatDate.format(date);

        return nomArtiste + " " + NouvelleDate + " " + nbTicketsVendus;
    }

    public Concert(String nomArtiste, int annee, int mois, int jour, boolean complet, int nbTicketsVendus,
            Salle salle) {
        this.nomArtiste = nomArtiste;
        this.complet = complet;
        this.nbTicketsVendus = 8000 - nbTicketsVendus;
        this.salle = salle;
        date = LocalDate.of(annee, mois, jour);
    }
}
