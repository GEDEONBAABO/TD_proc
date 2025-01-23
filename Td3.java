package TD_proc;
import java.util.Scanner;

public class Td3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x, y, prod, div, sous, som;
        String op;
        System.out.print("Entrer le premier nombre : ");
        x = scanner.nextInt();
        System.out.print("Entrer le deuxième nombre : ");
        y = scanner.nextInt();
        System.out.print("Choisissez l'opération à faire mettant soit *, +, -, / : ");
        op = scanner.next();
        switch (op) {
            case "*":  prod = x * y;
                System.out.println("Le double du produit est : " + 2*prod);
                break;
            case "+":  som = x + y;
                System.out.println("Ls double de la somme est : " + 2*som);
                break;
            case "-":  sous = x - y;
                System.out.println("Le double de la différence est : " + 2*sous);
                break;
            case "/":  div = x / y;
                System.out.println("Le double de la différence est : " + 2*div);
                break;
            default:
                break;
        }
    }
}