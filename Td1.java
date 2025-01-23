package TD_proc;
import java.util.Scanner;

public class Td1 {
    public static void main(String[] args) {
        int h, m, s, r1, S;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de séconde : ");
        S = scanner.nextInt();
        h = S/3600;
        r1 = S%3600;
        m = r1/60;
        s = r1%60;
        System.out.print("Votre temps est de " + h + "heures " + m + "minutes " + s + "sécondes");
    }
}