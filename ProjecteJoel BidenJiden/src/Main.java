import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Jiden = scanner.nextInt();
        int Drump = scanner.nextInt();

        if (Jiden > Drump) {
            System.out.println("Jiden");
        } else {
            System.out.println("Drump");
        }
    }
}
