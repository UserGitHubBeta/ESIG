public class App {
    public static void main(String[] args) throws Exception {
        // Déclaration d'un objet de création
        MyMarque Apple = new MyMarque("Apple"); // Création d'une nouvelle instance de classe

        // Déclarationn d'un objet de création
        MyPhone iPhone = new MyPhone(250, "Iphone 12", Apple); // Appellation à la variable "Apple" deja inscrite dans le constructeur MyMarque

        // Appel à l'instance de création contenant l'objet "Apple"
        System.out.println(Apple.nomMarque);

        // Appel à l'instance de création contenant l'objet "iPhone"
        System.out.println(iPhone.nomPhone);
    }
}
    class MyPhone {
        // Création des variables de tout type
        int pixels;
        String nomPhone;
        // Utilisation de la variable en tant que "Class"
        MyMarque marque;
        
        // Création d'un constructeur dans une classe
        public MyPhone (int pixels, String name, MyMarque marque) {
            this.pixels = pixels;
            this.nomPhone = name;
            this.marque = marque;
        }
    }

    class MyMarque {
        String nomMarque;

        // Création d'un constructeur dans une classe et réutilisation des variables locales
        public MyMarque (String nameMarque) {
            // Mise à jour de la variable avec "this"
            this.nomMarque = nameMarque;
        }
    }

