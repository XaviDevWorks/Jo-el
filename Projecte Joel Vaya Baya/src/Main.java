import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String frase = scanner.nextLine();
            String resultat = "";
            for (int j = 0; j < frase.length(); j++) {
                char lletra = frase.charAt(j);
                if (lletra == 'b') {
                    resultat += 'v';
                } else if (lletra == 'v') {
                    resultat += 'b';
                } else if (lletra == 'B') {
                    resultat += 'V';
                } else if (lletra == 'V') {
                    resultat += 'B';
                } else {
                    resultat += lletra;
                }
            }
            System.out.println(resultat);
        }
    }
}
