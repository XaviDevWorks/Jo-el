import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();

        for (int i = 0; i < c; i++) {
            int numero = scanner.nextInt();
            int resultat = numero + 1;
            System.out.println(resultat);
        }
    }
}
