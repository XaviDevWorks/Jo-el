import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horas = scanner.nextInt();
        int faltasJust = scanner.nextInt();
        int faltas = scanner.nextInt();
        double porcentajeF = horas * 0.1;
        double porcentajeFa = horas * 0.2;

        if (faltas <= porcentajeF && (faltasJust + faltas) <= porcentajeFa) {
            System.out.println("SI");
        } 

        else {
            System.out.println("NO");
        }
    }
}
