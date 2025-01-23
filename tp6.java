package TD_proc;
import java.util.Scanner;

public class tp6 {
    
    // Fonction pour calculer le discriminant
    public static double calculerDiscriminant(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    // Procédure pour afficher les solutions
    public static void afficherSolutions(double a, double b, double c) {
        double delta = calculerDiscriminant(a, b, c);
        
        System.out.println("L'équation à résoudre est: " + a + "x^2 + " + b + "x + " + c + " = 0");
        
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Les solutions sont: x1 = " + x1 + " et x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Il y a une solution unique: x = " + x);
        } else {
            System.out.println("Pas de solution réelle (delta est négatif).");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer les coefficients
        System.out.print("Entrez le coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Entrez le coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Entrez le coefficient c: ");
        double c = scanner.nextDouble();

        // Appeler la procédure pour afficher les solutions
        afficherSolutions(a, b, c);
    }
}