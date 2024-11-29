import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nom1 = scanner.next();
        int edat1 = scanner.nextInt();
        String nom2 = scanner.next();
        int edat2 = scanner.nextInt();

        if (edat1 > edat2) {
            System.out.println(nom1);
        }
        else if (edat2 > edat1) {
            System.out.println(nom2);
        }
        else {
            System.out.println("Tenen la mateixa edat");
        }
    }
}
