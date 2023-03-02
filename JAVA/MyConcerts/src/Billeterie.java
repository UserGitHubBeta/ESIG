public class Billeterie {

    public static boolean acheterBillet(Concert nomConcert) {
        if (nomConcert.nbTicketsVendus <= 8000) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        Ville montreux = new Ville("Montreux", 3);
        Ville bruxelles = new Ville("Bruxelles", 2.7);
        Ville carouge = new Ville("Carouge", 3.8);

        Salle stravinsky = new Salle("Stravinsky", montreux, 75, 20, 20, 10);
        Salle arena = new Salle("Arena", bruxelles, 100, 30, 30, 15);
        Salle chatNoir = new Salle("Chat Noir", carouge, 15, 6, 6, 3);

        Concert mozart = new Concert("Mozart", 2020, 07, 25, true, 3900, stravinsky);
        Concert chopin = new Concert("Chopin", 2020, 07, 26, true, 3900, stravinsky);
        Concert stromae = new Concert("Stromae", 2020, 10, 10, true, 6885, arena);
        Concert angele = new Concert("Angèle", 2020, 03, 13, true, 273, chatNoir);

        System.out.println(mozart);
        System.out.println(chopin);
        System.out.println(stromae);
        System.out.println(angele);

        // for (int i = 0; i <= 2; i++) {
        //     System.out.println(acheterBillet(mozart));
        // }
    }
}