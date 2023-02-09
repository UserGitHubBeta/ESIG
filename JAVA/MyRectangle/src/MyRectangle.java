public class MyRectangle {
    // Création des différents affichages de résultat
    public static void main(String[] args) throws Exception {
        // Création d'une variable permettant d'enregistrer des nouvelles valeurs
        Rectangle rectangle1 = new Rectangle(4, 5);
        rectangle1.setCouleur("rouge");
        System.out.println("Le périmètre de rectangle1 est : " + rectangle1.calculerPerimetre());
        System.out.println("La surface de rectangle1 est : " + rectangle1.calculerSurface());
        System.out.println("Est-ce un carré ? : " + rectangle1.estCeUnCarre());
        System.out.print("La couleur est : " + rectangle1.getCouleur());

        /*
         * A partir de la class "boolean" dans estUnCarre() si la largeur = hauteur
         * La valeur est true dans la réponse (ligne "Est-ce un carré ?")
         */
        Rectangle rectangle2 = new Rectangle(9, 7);
        rectangle2.setCouleur("vert");
        System.out.println("Le périmètre de rectangle2 est : " + rectangle2.calculerPerimetre());
        System.out.println("La surface de rectangle2 est : " + rectangle2.calculerSurface());
        System.out.println("Est-ce un carré ? : " + rectangle2.estCeUnCarre());
        System.out.print("La couleur est : " + rectangle2.getCouleur());

        Rectangle rectangle3 = new Rectangle(6, 6);
        rectangle3.setCouleur("bleu");
        System.out.println("Le périmètre de rectangle3 est : " + rectangle3.calculerPerimetre());
        System.out.println("La surface de rectangle3 est : " + rectangle3.calculerSurface());
        System.out.println("Est-ce un carré ? : " + rectangle3.estCeUnCarre());
        System.out.print("La couleur est : " + rectangle3.getCouleur());
    }
}

// Création d'une classe "Rectangle"
class Rectangle {
    private int largeur;
    private int hauteur;
    private String couleur = "noir";

    // Création d'un constructeur instance incluant les variables et update des
    // valeurs
    public Rectangle(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    // Début des création des méthodes
    public int calculerPerimetre() {
        return 2 * (largeur + hauteur);
    }

    public int calculerSurface() {
        return largeur * hauteur;
    }

    public boolean estCeUnCarre() {
        return largeur == hauteur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public String getCouleur() {
        return couleur;
    }

    // Fin des création des méthodes
}