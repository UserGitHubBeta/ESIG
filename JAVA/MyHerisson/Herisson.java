import greenfoot.Actor;
import greenfoot.Greenfoot;

/**
 * Cette classe implemente un herisson. Les herissons - dans ce scenario - se deplacent dans le jardin
 * et mangent des pommmes - si ils en trouvent.
 * 
 * @author Michael Koelling
 * @version 1.0
 */
public class Herisson extends Actor
{
    int nombreDePommesMangees;
    String nom;

    /**
     * Creation d un herisson, tourne vers la droite au depart (0 degres) .
     */
    public Herisson(String theName)
    {
        nom = theName;
        nombreDePommesMangees = 0;
    }

    /**
     * Fait ce que le herisson veut faire juste maintenant.
     */
    public void act()
    {
        if(pommeTrouvee()) {
            mangerUnePomme();
        }
        else if (Greenfoot.getRandomNumber(100) < 35) {  // 35% chance
            turnRandom();
        }
        else {
            move();
        }
    }
    
    public void move()
    {
    	move(1);
    }
    
    /**
     * Teste si une pomme se trouve au meme endroit que ce herisson. Renvoie true (vrai) si
     * c est le cas, false (faux) si il n y a pas de pomme au meme endroit.
     */
    public boolean pommeTrouvee()
    {
        Actor pomme = getOneObjectAtOffset(0, 0, Pomme.class);
        return pomme != null;
    }

    /**
     * Mange une pomme.
     */
    public void mangerUnePomme()
    {
        Actor pomme = getOneObjectAtOffset(0, 0, Pomme.class);
        if(pomme != null) {
            // mange la pomme...
            getWorld().removeObject(pomme);
            nombreDePommesMangees = nombreDePommesMangees + 1; 
        }
    }
    
    /**
     * Change le nom de ce herisson.
     */
    public void setNom(String theNewName)
    {
        nom = theNewName;
    }
    
    /**
     * Soyons polis et disons "Bonjour" a tout le monde.
     */
    public String disBonjour()
    { 
        String presentation = "Bonjour, je suis " + nom;
        return presentation;
    }

    /**
     * Tourne de 90 degres sur la gauche.
     */
    public void turnLeft()
    {
        turn(-90);
    }
    
    /**
     * Tourne de 90 degres sur la droite.
     */
    public void turnRight()
    {
        turn(90);
    }

    /**
     * Tourne au hasard soit a droite, soit a gauche.
     */
    public void turnRandom()
    {
        if (Greenfoot.getRandomNumber(2) == 0) {
            turn(90);
        }
        else {
            turn(-90);
        }
    }

    /**
     * Retourne le nombre de pommes que ce herisson a mange.
     */
    public int getNombreDePommesMangees()
    {
        return nombreDePommesMangees;
    }

    /**
     * Indique si le herisson a mange un nombre pair de pommes.
     */
    public boolean aMangeNombrePair()
    {
        return false;
    }

    /**
     * Retourne le nombre de pommes mangees en prenant en compte un amortissement (digestion)
     * de 20% par heure.
     */
    public double nombrePommesAvecAmortissement(int nbHeures)
    {
        // s01ex03: ecrire ici
        return -1;
    }

   
}

