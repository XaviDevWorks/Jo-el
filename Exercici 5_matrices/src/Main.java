import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aqui tienes el programa 5 de matrices");

        int [][] array = new int[20][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.println("Dame la nota del alumno");
                array[i][j] = scanner.nextInt();
            }
        }

        int suma = 0;
        int [] max = new int [3];
        int [] min = new int [3];

        for (int i=0; i<array[0].length; i++){

        }
    }
}