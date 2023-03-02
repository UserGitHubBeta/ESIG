public class Salle {
    // Créer une variable appartenant à une classe mère
    String nomSalle;
    // Importation de la classe "Ville" pour l'utiliser dans cette classe
    Ville ville;
    double largeurSalle;
    double longeurSalle;
    double largeurScène;
    double longeurScène;

    public Salle(String nomSalle, Ville ville, double largeurSalle, double longeurSalle, double largeurScène,
            double longeurScène) {
        this.nomSalle = nomSalle;
        this.ville = ville;
        this.largeurSalle = largeurSalle;
        this.longeurSalle = longeurSalle;
        this.largeurScène = largeurScène;
        this.longeurScène = longeurScène;
    }
}
