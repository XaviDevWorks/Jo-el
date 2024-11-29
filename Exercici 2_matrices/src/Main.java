import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al programa!");
        System.out.println("Matriz 3xM");

        System.out.println("Dame el valor m");
        int num2 = scanner.nextInt();

        int [] [] array = new int[3][num2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < num2; j++){
                System.out.println("Dame el numero: "+(i+1)+"N y el numero: "+(j+1)+ "M");
                array  [i][j] = scanner.nextInt();
            }
        }

        int suma = 0;
        int [] sumarray = new int[num2];
        int [] max = new int[num2];
        int [] min = new int [num2];

        for (int j = 0; j < num2; j++) {
            max[j] = array[0][j];
            min[j] = array[0][j];
        }

        for (int j = 0; j < num2; j++){
            for (int i = 0; i < 3; i++){
                int valor = array[i][j];
                suma += valor;
                if (valor > max[j]) {
                    max[j] = valor;
                }
                if (valor < min[j]) {
                    min[j] = valor;
                }
            }
            sumarray[j] = suma;
        }


        System.out.println("Resultados por columna:");
        for (int j = 0; j < num2; j++) {
            System.out.println("Columna " + (j + 1) + ":");
            System.out.println("  Suma: " + sumarray[j]);
            System.out.println("  Máximo: " + max[j]);
            System.out.println("  Mínimo: " + min[j]);
        }
    }
}