import greenfoot.Greenfoot;
import greenfoot.World;

import java.util.List;

/**
 * Un jardin ou vivent les herissons.
 * 
 * @author Michael Koelling
 * @version 1.0
 */
public class Jardin extends World
{
    /**
     * Creation d'un nouveau "monde" avec 8x8 cellules de 60x60 pixels chacune
     */
    public Jardin() 
    {
        super(8, 8, 60);
        setPaintOrder(Herisson.class, Pomme.class);

        prepare();
    }

    public void afficherPommesMangees()
    {
        // cette ligne initialise un tableau avec le nombre de pommes mangees
        // pour chaque herisson du Jardin
        int[] tableauPommesMangees = getTableauPommesMangees();

        // s01ex04 : ecrire ici
    }

    /**
     * Retourne le tableau du nombre de pommes mangees par herisson.
     */
    public int[] getTableauPommesMangees()
    {
        Herisson[] tableauHerissons = getTableauHerissons();
        int[] tableauPommesMangees = new int[tableauHerissons.length];
        for (int h = 0; h < tableauHerissons.length; h++)
        {
            tableauPommesMangees[h] = tableauHerissons[h].nombreDePommesMangees;
        }
        return tableauPommesMangees;
    }

    /**
     * Dispose un certain nombre de pommes de facon aleatoire dans le jardin.
     * Le nombre de pommes peut etre specifie.
     */
    public void randomApples(int howMany)
    {
        for(int i=0; i<howMany; i++) {
            Pomme pomme = new Pomme();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(pomme, x, y);
        }
    }

    /**
     * Retourne tous les herissons sous forme de tableau
     */
    private Herisson[] getTableauHerissons()
    {
        List<Herisson> listeHerissons = getObjects(Herisson.class);
        return listeHerissons.toArray(new Herisson[]{});
    }

    /**
     * Prepare le "monde" au demarrage du programme. C'est a dire: Creer les objets initiaux
     * et les ajouter au "monde".
     */
    private void prepare()
    {
        Herisson herisson = new Herisson("Friedolin");
        addObject(herisson, 1, 2);
        randomApples(7);
        Herisson herisson2 = new Herisson("Elisabeth");
        addObject(herisson2, 3, 6);
    }
}
