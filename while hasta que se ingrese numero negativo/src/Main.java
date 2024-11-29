import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero = 0;
        numero = scanner.nextInt();
        while (numero >= 0) {
            suma += numero;
            numero = scanner.nextInt();
        }
        System.out.println("La suma de los números positivos es: " + suma);
    }
}