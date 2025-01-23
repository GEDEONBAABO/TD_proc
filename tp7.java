package TD_proc;
import java.util.Scanner;

public class tp7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] tableau = new double[10]; // Initialiser un tableau de 10 réels

        // Demander à l'utilisateur d'entrer les éléments du tableau
        System.out.println("Veuillez entrer 10 nombres réels :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Élément " + (i + 1) + ": ");
            tableau[i] = scanner.nextDouble();
        }

        // Calculer la somme, le produit et la moyenne
        double somme = 0;
        double produit = 1;

        for (double nombre : tableau) {
            somme += nombre; // Calculer la somme
            produit *= nombre; // Calculer le produit
        }

        double moyenne = somme / tableau.length; // Calculer la moyenne

        // Afficher les résultats
        System.out.println("Somme des éléments: " + somme);
        System.out.println("Produit des éléments: " + produit);
        System.out.println("Moyenne des éléments: " + moyenne);
    }
}