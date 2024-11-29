import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int altura = scanner.nextInt();
            int base = scanner.nextInt();

            double area = (base*altura)/2.0;
            System.out.println(area);
        }
    }
}
