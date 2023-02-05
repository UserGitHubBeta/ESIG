import javax.swing.table.TableColumn;

public class MyCollect {
    public static void main(String[] args) throws Exception {
        // Création d'une string "tableau" permettant de stocker 10 éléments dedans
        String[] tableau = new String[10];
        
        // Index toujours commencant à 0 !!!!
        tableau[3] = "Index 3";
        tableau[1] = "Index 1"; // "Index 1" = clé de la valeur "tableau"
        tableau[3] = "Index 3 bis"; // Remplacement de la variable précédente

        // Pour chaque élément plus petit que la taille du tableau grâce à la variable "length"
        for(int i = 0; i < tableau.length; i++) {
            // Affichage de chaque élément à partir du talbeau crée dans la ligne 6
            System.out.println(tableau[i]);
        }
    }
}
