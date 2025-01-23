package TD_proc;
import java.util.Scanner;

public class tp9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialiser les deux matrices 4x4
        int[][] matrice1 = new int[4][4];
        int[][] matrice2 = new int[4][4];

        // Remplir la première matrice
        System.out.println("Entrez les éléments de la première matrice (4x4) :");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Élément [" + i + "][" + j + "]: ");
                matrice1[i][j] = scanner.nextInt();
            }
        }

        // Remplir la seconde matrice
        System.out.println("Entrez les éléments de la seconde matrice (4x4) :");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Élément [" + i + "][" + j + "]: ");
                matrice2[i][j] = scanner.nextInt();
            }
        }

        // Afficher la première matrice
        System.out.println("La première matrice est :");
        afficherMatrice(matrice1);

        // Afficher la seconde matrice
        System.out.println("La seconde matrice est :");
        afficherMatrice(matrice2);

        // Calculer la transposée de la seconde matrice
        int[][] transpoMatrice2 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transpoMatrice2[j][i] = matrice2[i][j];
            }
        }

        // Calculer le produit de la première matrice et de la transposée de la seconde
        int[][] produit = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                produit[i][j] = 0; // Initialiser le produit
                for (int k = 0; k < 4; k++) {
                    produit[i][j] += matrice1[i][k] * transpoMatrice2[j][k];
                }
            }
        }

        // Afficher le produit
        System.out.println("Le produit de la première matrice et de la transposée de la seconde est :");
        afficherMatrice(produit);
    }

    // Méthode pour afficher une matrice
    public static void afficherMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println(); // Nouvelle ligne après chaque ligne de la matrice
        }
    }
}