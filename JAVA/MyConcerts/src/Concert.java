import java.time.LocalDate;

public class Concert {
    Salle salle;
    String nomArtiste;
    LocalDate date;
    boolean complet;
    int nbTicketsVendus;

    public Concert(String nomArtiste, int annee, int mois, int jour, boolean complet,
            int nbTicketsVendus, Salle salle) {
        this.nomArtiste = nomArtiste;
        this.complet = complet;
        this.nbTicketsVendus = nbTicketsVendus;
        this.salle = salle;
        date = LocalDate.of(annee, mois, jour);
    }
}
