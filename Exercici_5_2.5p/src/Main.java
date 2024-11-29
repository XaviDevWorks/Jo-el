import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flg = true;
        int incidencia = 0;
        int aula = 0;
        String persona = "";
        String departament = "";

        while (flg) {
            int opcion = 0;

            System.out.println("Benvinguts al programa de registre de incidències");
            System.out.println("Si us plau, escull una de les següents opcions.");
            System.out.println("1. Registrar incidència");
            System.out.println("2. Consultar última incidència registrada");
            System.out.println("3. Consultar número de incidències que s'han registrat");
            System.out.println("4. Sortir del programa");
            System.out.print("Opció escollida: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Donar d'alta nova incidència:");
                    System.out.print("Quina aula s'ha fet? ");
                    aula = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Quina persona ho ha fet? ");
                    persona = scanner.nextLine();
                    System.out.println("Quin departament és?");
                    System.out.println("(Ejemplo: Informática, Marketing, Comercio internacional, Integración Social)");
                    departament = scanner.nextLine();
                    incidencia++;
                    break;
                case 2:
                    System.out.println("Última incidència registrada:");
                    System.out.println("Aula: " + aula);
                    System.out.println("Persona que ha informat: " + persona);
                    System.out.println("Departament: " + departament);
                    break;
                case 3:
                    System.out.println("El número de incidències és: " + incidencia);
                    break;
                case 4:
                    System.out.println("Tancant programa");
                    flg = false;
                    break;
                default:
                    System.out.println("Error: opció no vàlida.");
            }
        }
    }
}
