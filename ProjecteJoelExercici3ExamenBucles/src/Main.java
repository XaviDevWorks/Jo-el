import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mida = scanner.nextInt();


        for (int fila=0; fila<mida; fila++) {
            if (fila==0 || fila==mida-1) {
                for (int columna = 0; columna < mida; columna++) {
                    System.out.print('@');
                }
            }
            else {
                System.out.print('@');
                for (int columna = 1; columna < mida - 1; columna++) {
                    System.out.print(' ');
                }
                System.out.print('@');
            }
            System.out.println();
        }
    }
}
