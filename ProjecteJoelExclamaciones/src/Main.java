import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String palabra = scanner.nextLine();

            if (palabra.equals("FIN")) {
                break;
            }

            int abrirEx = 0;
            int cerrarE = 0;

            for (char c : palabra.toCharArray()) {
                if (c == '¡') {
                    abrirEx++;
                }
                else if (c == '!') {
                    cerrarE++;
                }
            }

            if (abrirEx == cerrarE) {
                System.out.println("SI");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
