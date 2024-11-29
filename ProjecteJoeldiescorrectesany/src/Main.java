import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia = scanner.nextInt();

        if (dia < 1 || dia > 366) {
            System.out.println("Incorrecte!");
        } else if (dia <= 365) {
            System.out.println("Correcte per un any no bixest!");
        } else {
            System.out.println("Correcte per un any bixest!");
        }
    }
}
