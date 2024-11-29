import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        boolean divisible = true;

        if (N % 1 != 0) {
            divisible = false;
        }
        if (N % 2 != 0) {
            divisible = false;
        }
        if (N % 3 != 0) {
            divisible = false;
        }
        if (N % 4 != 0) {
            divisible = false;
        }
        if (N % 5 != 0) {
            divisible = false;
        }
        if (N % 6 != 0) {
            divisible = false;
        }

        if (N % 7 != 0) {
            divisible = false;
        }

        if (N % 8 != 0) {
            divisible = false;
        }

        if (N % 9 != 0) {
            divisible = false;
        }

        if (divisible) {
            System.out.println("SI");
        }

        else {
            System.out.println("NO");
        }
    }
}

