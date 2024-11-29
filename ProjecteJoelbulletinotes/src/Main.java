import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num >= 0 && num <= 4) {
            System.out.println("Suspes");
        }

        else if (num>=5 && num<=6) {
            System.out.println("Aprovat");
        }

        else if (num>=7 && num<=8) {
            System.out.println("Notable");
        }

        else if (num>=9 && num<=10) {
            System.out.println("Excelent");
        }
    }
}
