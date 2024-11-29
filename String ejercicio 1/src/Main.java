//Escriu un programa per calcular la longitud d'una cadena i que ho mostri per
//pantalla.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introdueix una cadena de text: ");
        String cadena = input.nextLine();
        int longitud = cadena.length();
        System.out.println("La longitud de la cadena és: " + longitud);
    }
}