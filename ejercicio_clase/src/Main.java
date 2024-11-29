import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Cuantos numeros quieres introducir");

        int numValors = scanner.nextInt();
        int valorAcumulado = 0;
        int valor;

        System.out.println("Empieza a introducir valores");
        for(int i = 0; i< numValors; i++){
            valor = scanner.nextInt();
            valorAcumulado +=valor;

        }


        System.out.println("El promedio es "+ valorAcumulado/numValors);

        float[] scores;
        float sumClassScore = 0;
        for (int i = 0; i<scores.length; i++){

        }
    }
}