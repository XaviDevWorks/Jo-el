import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        // Leer los 10 números del teclado y almacenarlos en el array
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // Guardar el último elemento del array
        int ultimo = array[array.length - 1];

        // Desplazar los elementos una posición a la derecha
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        // Colocar el último elemento en la primera posición
        array[0] = ultimo;

        // Mostrar el array resultante
        System.out.println("El array desplazado es:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
