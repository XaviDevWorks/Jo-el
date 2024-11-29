import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int comodines = 0;
        if (num == 0) comodines++;
        if (num1 == 0) comodines++;
        if (num2 == 0) comodines++;

        int val = (num == 0) ? num1 : num;
        int val1 = (num1 == 0) ? val : num1;
        int val2 = (num2 == 0) ? val : num2;

        if (val == val1 && val1 == val2) {
            System.out.println("TRIO");
        }
        else if (val == val1 || val1 == val2 || val == val2) {
            System.out.println("PARELLA");
        }
        else {
            System.out.println("RES");
        }
    }
}
