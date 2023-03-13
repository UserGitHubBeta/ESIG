public class MyCarApp {
    public static void main(String[] args) throws Exception {
        // Création d'un objet permettant d'afficher True au démarrage du prog
        MyCar voiture = new MyCar();
        voiture.StartCar();

        // Addition des classes principales et hérités pour le démarrage du programe
        MyBateau bateau = new MyBateau();
        bateau.StartCar();

        // Création des variables comportant la variable de chaque classe et inclusion de la class mère
        MyAnimal Animal = new MyAnimal();

        MyAnimal Chien = new MyDog();

        MyAnimal Oiseau = new MyOiseau();

        // Implantation des actions de chaque classe avec la fonction dédié

        Animal.Deplacement();
        Chien.Deplacement();
        Oiseau.Deplacement();

    }
}

// Class mère qui contient toutes les procédures et fonctions pour les autres classes
class MyVehicule {
    void StartCar() {
    System.out.println("Démarrage du véhicule !");
    System.out.println();
    }
}

// Création d'une classe afin d'afficher son lancement
// extends = permet de faire accéder à la classe principale ses fonctions associées
// Class enfants reliée à la class mère
class MyCar extends MyVehicule {
    // Création de la fonction "StartFeu()"
    void StartFeuVoiture() {
        System.out.println("Allumage feu !");
    }

    // Création d'une méthode à laquelle on imbrique la fonction "StartFeu()"
    @Override // --> Surchage de la class mère 
    void StartCar(){
        // super = permet de faire référence à la class mère "MyVehicule" et de garder en mémoire l'action précédente
        super.StartCar();
        StartFeuVoiture();
    }
}

class MyBateau extends MyVehicule {

}

// Autre forme d'héritage
class MyForme {
    public int x;
    public int y;

    public void ExportTo(int NewX, int NewY) {
        this.x = NewX;
        this.y = NewY;
    }
}

class MyCarre extends MyForme {
    private long LongCote; // long = définir une valeur plus longue pour la variable
    public long getCote() {
        return LongCote;
    }

    public long getPerimetre() {
        return 4 * LongCote;
    }
}


// Autre forme d'héritage et de polymorphisme

/* 
 * Chaque class possède la même fonction, 
 * mais l'action est différente 
 * pour chaque une d'elle
*/
class MyAnimal {
    void Deplacement() {
        System.out.println("Je me déplace");
    }
}

class MyDog extends MyAnimal {
    void Deplacement() {
        System.out.println("Je marche ");
    }
}

class MyOiseau extends MyAnimal {
    void Deplacement() {
        System.out.print("Je vole");
    }
}