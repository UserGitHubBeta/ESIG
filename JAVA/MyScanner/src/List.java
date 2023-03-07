import java.io.File;
import java.util.Scanner;

public class List {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {

      /* Somme de deux variables entières avec un scanner */

      System.out.print("Veuillez saisir un premier entier : ");
      int a = scanner.nextInt();

      System.out.print("Veuillez saisir un second entier : ");
      int b = scanner.nextInt();

      int result = a + b;
      System.out.printf("La somme de %d et de %d vaut %d\n", a, b, result);

      /*
       * Vérification d'une entrée de chaîne de caractère avec un scanner de variable
       */
      System.out.println("Saisir votre login : ");
      String mot = scanner.next();
      System.out.println("Saisir votre mot de passe : ");
      String password = scanner.next();

      if (mot.equals("benoit") && password.equals("password")) {
        System.out.println("Bienvenue " + mot);
      } else {
        System.out.println("Accès refusé !");
      }

    } catch (Exception e) {
      System.out.println("Une erreur a été levé !");
    }
    /* ======================================================== */

    scanTxt("\\\\nasedu01.ge-pedago.etat-ge.ch\\USR\\__ELV\\LOIC.AGST\\Documents\\ESIG\\JAVA\\MyScanner\\monTexte.txt");
  }

  /* Analyse et sortie des éléments d'un fichier avec un scanner */
  private static void scanTxt(String nomFichier) {
    Scanner sc_file = null;
    try {
      // Création d'une instance permettant de générer le fichier
      sc_file = new Scanner(new File(nomFichier));
      /*
       * Pendant que le scanner analyse le fichier,
       * il trie et affiche les éléments en string
       */
      while (sc_file.hasNext()) {
        // Affiche les éléments les uns après les autres.
        System.out.print(sc_file.next() + " ");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static int AddNumber(int number) {
    
  }
}