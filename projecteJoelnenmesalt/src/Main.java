import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double alt = scanner.nextDouble();
        double k1 = scanner.nextDouble();
        double k2 = scanner.nextDouble();
        double k3 = scanner.nextDouble();

        int nen = 0;
        double maxAltura = -1;

        if (k1 <= alt && k1 > maxAltura) {
            nen = 1;
            maxAltura = k1;
        }
        if (k2 <= alt && k2 > maxAltura) {
            nen = 2;
            maxAltura = k2;
        }
        if (k3 <= alt && k3 > maxAltura) {
            nen = 3;
            maxAltura = k3;
        }

        if (nen != 0) {
            System.out.println("Nen " + nen);
        } else {
            System.out.println("No hi ha cap nen");
        }
    }
}
