import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }
}