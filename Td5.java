package TD_proc;
import java.util.Scanner;

public class Td5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, i, nbr;
        x = 0;
        i = 0;
        System.out.print("Entrer le nombre entier positif : ");
        nbr = scanner.nextInt();
        while (nbr <=0 ){
            System.out.println("Entrer un nombre positif!!!");
            System.out.print("Entrer le nombre entier positif : ");
            nbr = scanner.nextInt();
        }
        while (x < nbr){
            x = x+i;
            i = i+1;
        }
        System.out.print("La somme est : " + x);
    }
}
