import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos= scanner.nextInt();
        scanner.nextLine();
        for (int i=0;i<casos;i++){
            System.out.println("Introduce una palabra:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("patata")) {
                System.out.println("Es Patata");
            } else {
                System.out.println("No es Patata");
            }
        }
    }
}
