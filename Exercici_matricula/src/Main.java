import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flg = true;

        System.out.println("Cuantas matriculas quieres?");
        int num = scanner.nextInt();

        String [] numeros = new String[num];

        while (flg){
            System.out.println("Menu principal:");
            System.out.println("1. Inscriure una nova matricula");
            System.out.println("2. Comprovar matricula venuda o si ja existeix");
            System.out.println("3. Sortir");
            int menu = scanner.nextInt();

            switch (menu){
                case 1:
                    for (int i = 0; i < num; i++) {
                        System.out.println("Añade la matrícula (solo los 4 números):");
                        numeros[i] = scanner.next();
                        System.out.println("Matrícula guardada con exito.");
                    }
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    flg=false;
                    break;
                default:
                    System.out.println("Error.");
                    break;
            }
        }
    }
}