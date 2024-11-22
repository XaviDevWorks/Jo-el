import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < casos; i++) {
            String paraula = scanner.nextLine();
            String[] intents = scanner.nextLine().split(" ");

            String resultat = "";
            int errors = 0;
            for (int j = 0; j < paraula.length(); j++) {
                resultat += "*";
            }

            char[] descobert = resultat.toCharArray();
            for (int j = 0; j < intents.length; j++) {
                char lletra = intents[j].charAt(0);
                boolean encert = false;
                for (int k = 0; k < paraula.length(); k++) {
                    if (paraula.charAt(k) == lletra) {
                        descobert[k] = lletra;
                        encert = true;
                    }
                }
                if (!encert) {
                    errors++;
                }
            }
            System.out.println(String.valueOf(descobert) + " " + errors);
        }
    }
}
