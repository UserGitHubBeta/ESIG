import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class List {

  public static void main(String[] args) {
    // try (Scanner scanner = new Scanner(System.in)) {

    // /* Somme de deux variables entières avec un scanner */

    // System.out.print("Veuillez saisir un premier entier : ");
    // int a = scanner.nextInt();

    // System.out.print("Veuillez saisir un second entier : ");
    // int b = scanner.nextInt();

    // int result = a + b;
    // System.out.printf("La somme de %d et de %d vaut %d\n", a, b, result);

    // /*
    // * Vérification d'une entrée de chaîne de caractère avec un scanner de
    // * variable
    // */
    // System.out.println("Saisir votre login : ");
    // String mot = scanner.next();
    // System.out.println("Saisir votre mot de passe : ");
    // String password = scanner.next();

    // if (mot.equals("benoit") && password.equals("password")) {
    // System.out.println("Bienvenue " + mot);
    // } else {
    // System.out.println("Accès refusé !");
    // }

    // } catch (Exception e) {
    // System.out.println("Une erreur a été levé !");
    // }
    /* ======================================================== */

    // scanTxt("\\\\nasedu01.ge-pedago.etat-ge.ch\\USR\\__ELV\\LOIC.AGST\\Documents\\ESIG\\JAVA\\MyScanner\\monTexte.txt");
    scanTxt("monTexte.txt");
    System.out.println(" ");
    AddNumbers("1 2 3");
    System.out.println(" ");
    System.out.println(scanPhrase("SA"));
    System.out.println(" ");

    String str1 = "1 un 2 deux 3 trois";
    double sum1 = SumWithOutTxt(str1);
    System.out.println(sum1);

    String str2 = "3 un deux 4 3,5 -20";
    double sum2 = SumWithOutTxt(str2);
    System.out.println(sum2);

    String str3 = "deux";
    double sum3 = SumWithOutTxt(str3);
    System.out.println(sum3);

    SumWithWordSpecific("Bananes 1 3 2 5 Pommes 0");
  }

  public static ArrayList<String> scanPhrase(String mot) {
    ArrayList<String> MyList = new ArrayList<>();
    Scanner sc_word = new Scanner(mot);
    if (mot.length() >= 2) {
      while (sc_word.hasNext()) {
        String ValWord = sc_word.next();
        System.out.println(ValWord);
        MyList.add(ValWord);
      }
    } else {
      System.out.println("Le mot doit être supérieur de 2 caractère !");
    }
    sc_word.close();
    return MyList;
  }

  /* Analyse et sortie des éléments d'un fichier avec un scanner */
  public static void scanTxt(String nomFichier) {
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

  public static int AddNumbers(String numbers) {

    Scanner scanner = new Scanner(numbers);
    int sum = 0;
    while (scanner.hasNext()) {
      if (scanner.hasNextInt()) {
        sum += scanner.nextInt();
      } else {
        scanner.next();
      }
    }
    System.out.println(sum);
    scanner.close();
    return sum;
  }

  public static int SumWithOutTxt(String str_word) {
    int sum = 0;
    Scanner sc_sumword = new Scanner(str_word);

    while (sc_sumword.hasNext()) {
      // Si il détecte des chiffres doubles dans la variable
      if (sc_sumword.hasNextInt()) {
        /*
         * Addition des valeurs de valeurs doubles ignorant ainsi même des valeurs
         * alphabétiques
         */
        sum += sc_sumword.nextInt();
      } else {
        sc_sumword.next();
      }
    }
    sc_sumword.close();
    return sum;
  }

  public static void SumWithWordSpecific(String str_sumword) {

    Scanner scWordSum = new Scanner(str_sumword);

    while (scWordSum.hasNext()) {
      /*
       * Variable permettant d'être stocker à chaque appariation d'un mot et revenir à
       * 0 pour être calculer de nouveau
       */
      int total_fruit = 0;
      // Création d'une variable permettant de stocker les valeurs alphanumériques
      String ValWord = scWordSum.next();

      while (scWordSum.hasNextDouble()) {
        // Somme des valeurs numériques après chaque détection
        total_fruit += scWordSum.nextDouble();
      }
      System.out.println(ValWord + " : " + total_fruit);
    }
    scWordSum.close();
  }
}