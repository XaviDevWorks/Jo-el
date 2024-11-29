import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inputA = scanner.nextLine();
            if (inputA.isEmpty()) break;
            int A = Integer.parseInt(inputA);
            String inputB = scanner.nextLine();
            if (inputB.isEmpty()) break;
            int B = Integer.parseInt(inputB);
            int diferencia = A - B;
            System.out.println(diferencia);
        }
    }
}
