import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido a la app de la Salle");

        int maxalum = 0;
        int maxdias = 0;
        int[][] array;
        boolean flg = true;
        int opt;
        int sum = 0;
        int diasPresents = 0;

        while (flg) {
            System.out.print(
                    "---------------------------------------\n" +
                            "                 Menu                  \n" +
                            "---------------------------------------\n" +
                            "1. Iniciar control de assistencia\n" +
                            "2. Listado de alumnos que no llegan al 80%\n" +
                            "3. Salir del programa\n"
            );
            opt = input.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Has entrado al apartado de iniciar control de asistencia");
                    System.out.println("Introdueix el nombre d'alumnes (maxim 20)");
                    maxalum = input.nextInt();
                    System.out.println("Introdueix el nombre de dies (maxim 10)");
                    maxdias = input.nextInt();

                    array = new int[maxalum][maxdias];
                    int[] sumArray = new int[maxalum];
                    int[] diasPresentes = new int[maxalum];

                    for (int i = 0; i < maxalum; i++) {

                        for (int j = 0; j < maxdias; j++) {
                            System.out.println("Si ha asistido es 0 sino es 1");
                            System.out.println("Introdueix l'assistencia per a l'alumne " + (i + 1) + ", dia " + (j + 1));
                            array[i][j] = input.nextInt();
                            sum += array[i][j];

                            if (array[i][j] == 0) {
                                diasPresents++;
                            }
                        }
                        sumArray[i] = sum;
                        diasPresentes[i] = diasPresents;
                    }

                    for (int i = 0; i < maxalum; i++) {
                        System.out.println("Alumne " + (i + 1) + ": Presents:"+diasPresentes[i]+", Absents: "+ sumArray[i]);
                    }
                    break;
                case 2:
                    boolean encontrado = false;

                    for (int i = 0; i < maxalum; i++) {
                        double porcentajeAsistencia = (double) diasPresentes[i] / maxdias * 100;
                        if (porcentajeAsistencia < 80) {
                            System.out.println("L'alumne " + (i + 1));
                            encontrado = true;
                        }
                    }

                    if (encontrado==false) {
                        System.out.println("Cap alumne té menys d'un 80% d'assistencia.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo");
                    flg = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
