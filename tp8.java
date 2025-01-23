package TD_proc;
import java.util.Scanner;

public class tp8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialiser un tableau à deux dimensions 4x5
        int[][] tableau = new int[4][5];

        // Remplir le tableau avec des valeurs aléatoires (ou vous pouvez demander à l'utilisateur d'entrer les valeurs)
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                tableau[i][j] = (int) (Math.random() * 100); // Valeurs aléatoires entre 0 et 99
            }
        }

        // Afficher le tableau sous forme de matrice
        System.out.println("Le tableau est :");
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print(tableau[i][j] + "\t");
            }
            System.out.println(); // Nouvelle ligne après chaque ligne du tableau
        }

        // Demander à l'utilisateur d'entrer un entier
        System.out.print("Entrez un entier à vérifier: ");
        int n = scanner.nextInt();

        // Vérifier si le nombre se trouve dans le tableau
        boolean trouve = false;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                if (tableau[i][j] == n) {
                    trouve = true;
                    break; // Sortir de la boucle si le nombre est trouvé
                }
            }
        }

        // Afficher le résultat
        if (trouve) {
            System.out.println("Le nombre " + n + " se trouve dans le tableau.");
        } else {
            System.out.println("Le nombre " + n + " ne se trouve pas dans le tableau.");
        }
    }
}