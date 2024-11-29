import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al programa!");
        System.out.println("Matriz NxM");

        System.out.println("Dame el valor n");
        int num1 = scanner.nextInt();

        System.out.println("Dame el valor m");
        int num2 = scanner.nextInt();

        int [] [] array = new int[num1][num2];

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++){
                System.out.println("Dame el numero: "+(i+1)+"N y el numero: "+(j+1)+ "M");
                array  [i][j] = scanner.nextInt();
            }
        }

        int suma = 0;
        int [] sumarray = new int[num2];

        for (int j = 0; j < num2; j++){
            for (int i = 0; i < num1; i++){
                suma += array [i][j];
            }
            sumarray[j] = suma;
        }

        System.out.println("Suma de columnas: ");
        for (int j = 0; j < num2; j++){
            System.out.println("Columna " + (j + 1) + ": " + sumarray[j]);
        }
    }
}