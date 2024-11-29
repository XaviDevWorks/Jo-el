import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nom = scanner.nextLine();
        System.out.printf("Hola, %s%n", nom);

        scanner.close();
    }
}