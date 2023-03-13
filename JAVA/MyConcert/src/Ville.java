/**
 * @author Clément Vogt
 * @version Version 1.0
 */
public class Ville {
    private double nbMaxSpectateursAuMetreCarre;

    public Ville(String nom, double nbMaxSpectateursAuMetreCarre) {
        this.nbMaxSpectateursAuMetreCarre = nbMaxSpectateursAuMetreCarre;
    }

    public double getNbMaxSpectateursAuMetreCarre() {
        return nbMaxSpectateursAuMetreCarre;
    }
}
