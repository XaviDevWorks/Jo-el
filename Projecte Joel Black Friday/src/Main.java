import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("De cuanto quieres la matriz?");
        int filas = scanner.nextInt();
        int columnas= scanner.nextInt();
        int [][]array= new int [filas][columnas];
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                array[i][j] =scanner.nextInt();
            }
        }
        int mult =scanner.nextInt();
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                array[i][j]*=mult;
            }
        }
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(array[i][j] + " ");;
            }
            System.out.println();
        }
    }
}