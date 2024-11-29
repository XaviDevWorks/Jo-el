import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int filas = scan.nextInt();
        int columnas = scan.nextInt();
        int [][]matriz = new int[filas][columnas];
        int [][]matriz2 = new int[filas][columnas];
        int [][]suma = new int[filas][columnas];

        // Rellenar primera matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {  // Cambio aquí
                matriz[i][j] = scan.nextInt();
            }
        }

        // Rellenar segunda matriz
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {  // Cambio aquí
                matriz2[i][j] = scan.nextInt();
            }
        }

        // Sumar las dos matrices
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {  // Cambio aquí
                suma[i][j] = matriz[i][j] + matriz2[i][j];
            }
        }

        // Mostrar la suma
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {  // Cambio aquí
                System.out.print(suma[i][j] + " ");  // Cambié println por print para mostrar la matriz de manera más legible
            }
            System.out.println();
        }
    }
}
