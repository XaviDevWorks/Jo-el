import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix una cadena de text: ");
        String palabra = input.nextLine();

        int g = 0, o = 0, l = 0, e = 0, punto = 0, c = 0, m = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            if (caracter == 'g') {
                g++;
            } else if (caracter == 'o') {
                o++;
            } else if (caracter == 'l') {
                l++;
            } else if (caracter == 'e') {
                e++;
            } else if (caracter == '.') {
                punto++;
            } else if (caracter == 'c') {
                c++;
            } else if (caracter == 'm') {
                m++;
            }
        }

        System.out.println("Frequència de caràcters:");
        if (g > 0) System.out.println("'g': " + g);
        if (o > 0) System.out.println("'o': " + o);
        if (l > 0) System.out.println("'l': " + l);
        if (e > 0) System.out.println("'e': " + e);
        if (punto > 0) System.out.println("'.': " + punto);
        if (c > 0) System.out.println("'c': " + c);
        if (m > 0) System.out.println("'m': " + m);
    }
}
