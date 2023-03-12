public class Salle {
    Ville ville;
    int largeurSalle;
    int longeurSalle;
    int largeurScène;
    int longeurScène;

    public Salle(Ville ville, int largeurSalle, int longeurSalle, int largeurScène, int longeurScène) {
        this.ville = ville;
        this.largeurSalle = largeurSalle;
        this.longeurSalle = longeurSalle;
        this.largeurScène = largeurScène;
        this.longeurScène = longeurScène;
    }

    public Ville getVille() {
        return ville;
    }

    public int getLargeurSalle() {
        return largeurSalle;
    }

    public int getLongueurSalle() {
        return longeurSalle;
    }

    public int getLargeurScene(){
        return largeurScène;
    }

    public int getLongueurScene() {
        return longeurScène;
    }
}
