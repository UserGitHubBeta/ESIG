import java.io.FileInputStream;
import java.util.Scanner;

public class List {

    public static void main(String[] args) {
        // try ( Scanner scanner = new Scanner( System.in ) ) {
            
        //     System.out.print( "Veuillez saisir un premier entier : " );
        //     int a = scanner.nextInt();
            
        //     System.out.print( "Veuillez saisir un second entier : " );
        //     int b = scanner.nextInt();
            
        //     int result = a + b;
        //     System.out.printf( "La somme de %d et de %d vaut %d\n", a, b, result );

        //     System.out.println("Saisir votre login : ");
        //     String mot = scanner.next();
        //     System.out.println("Saisir votre mot de passe : ");
        //     String password = scanner.next();

        //     if (mot.equals("benoit") && password.equals("password")) {
        //         System.out.println("Bienvenue " + mot);
        //     } else {
        //         System.out.println("Accès refusé !");
        //     }

        // } catch (Exception e) {
        //     System.out.println("Une erreur a été levé !");
        // }  
        
        try (FileInputStream inputStream = new FileInputStream( "monTexte.txt" ) ;
        Scanner scanner = new Scanner( inputStream ) ) {
      // Affichage 
        }
    }

    
}