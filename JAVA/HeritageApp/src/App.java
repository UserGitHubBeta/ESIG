public class App {
    public static void main(String[] args) throws Exception {
        // Création d'un objet permettant d'afficher True au démarrage du prog
        MyCar voiture = new MyCar();
        voiture.StartCar();
    }
}

// Création d'une classe afin d'afficher son lancement
class MyCar {
    void StartCar() {
        System.out.println("VRRRROUMMM");
    }
}