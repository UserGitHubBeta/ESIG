/**
 * @author Clément Vogt
 * @version Version 1.0
 */
public class Salle {
    private Ville ville;
    private int largeurSalle;
    private int longueurSalle;
    private int largeurScene;
    private int longueurScene;

    public Salle(Ville ville, int largeurSalle, int longueurSalle, int largeurScene, int longueurScene) {
        this.ville = ville;
        this.largeurSalle = largeurSalle;
        this.longueurSalle = longueurSalle;
        this.largeurScene = largeurScene;
        this.longueurScene = longueurScene;
    }

    public Ville getVille() {
        return ville;
    }

    public int getLargeurSalle() {
        return largeurSalle;
    }

    public int getLongueurSalle() {
        return longueurSalle;
    }

    public int getLargeurScene() { return largeurScene; }

    public int getLongueurScene() { return longueurScene; }
}
