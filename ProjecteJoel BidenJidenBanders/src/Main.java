import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Jiden = scanner.nextInt();
        int Drump = scanner.nextInt();
        int Banders = scanner.nextInt();

        if (Jiden > Drump && Jiden > Banders) {
            System.out.println("Jiden");
        } else if (Drump > Jiden && Drump > Banders) {
            System.out.println("Drump");
        } else {
            System.out.println("Banders");
        }
    }
}
