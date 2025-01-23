package TD_proc;
import java.util.Scanner;

public class Td4for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, nbr_depart, nbr_prec;
        System.out.print("Entrer la valeur de départ : ");
        nbr_depart = scanner.nextInt();
        System.out.print("Entrer combien de nombre précédent voulez-vous : ");
        nbr_prec = scanner.nextInt();
        for (int i = 1; i <= nbr_prec; i++) {
            x = nbr_depart-i;
            System.out.println(x);
        }
    }
}