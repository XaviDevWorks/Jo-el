import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("sortida")) {
                break;
            }
            System.out.println("Sssh, únicament acaba quan posis sortida");
        }
    }
}
