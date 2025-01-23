package TD_proc;
import java.util.Scanner;

public class Td2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z, som, prod;
        System.out.print("Entrer la valeur du premier nombre : ");
        x = scanner.nextInt();
        System.out.print("Entrer la valeur du deuxième nombre : ");
        y = scanner.nextInt();
        System.out.println("Le premier nombre est : " + x + " et le deuxième est : " + y);
        prod = x * y;
        som = x + y;
        if (prod <= 0) {
            z = x;
            x = y;
            y = z;
            System.out.println("Le premier nombre est : " + x + " et le deuxième est : " + y);
        }
        else {
            x = prod;
            y = som;
            System.out.println("La somme  est : " + y + " et le produit est : " + x);
        }
    }
}