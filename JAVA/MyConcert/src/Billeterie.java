import java.time.LocalDate;

/**
 * @author Clément Vogt
 * @version Version 1.0
 */
public class Billeterie {
    private static boolean acheterBillet(Concert c) {
        return c.achatBillet();
    }

    private static void acheterBillets(Concert c) {
        int i = 0;
        while (i < 8000 && acheterBillet(c)) {
            i++;
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        Ville montreux = new Ville("Montreux",3);
        Ville bruxelles = new Ville("Bruxelles ",2.7);
        Ville carouge = new Ville("Carouge ",3.8);

        Salle stravinsky = new Salle(montreux,20,75,20,10);
        Salle arena = new Salle(bruxelles,30,100,30,15);
        Salle chatNoir = new Salle(carouge,6,15,6,3);

	    Concert mozart = new Concert("Mozart", LocalDate.of(2020, 7, 25),stravinsky);
        Concert chopin = new Concert("Chopin", LocalDate.of(2020, 7, 26),stravinsky);
        Concert stromae = new Concert("Stromae", LocalDate.of(2020, 10, 10),arena);
        Concert angele = new Concert("Angèle", LocalDate.of(2020, 3, 13),chatNoir);

        acheterBillets(mozart);
        acheterBillets(chopin);
        acheterBillets(stromae);
        acheterBillets(angele);
    }
}
