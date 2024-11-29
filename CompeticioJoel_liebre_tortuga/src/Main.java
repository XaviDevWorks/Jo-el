import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = 0;
        int pinicial_tortuga = 0;
        int pfinal_tortuga = 0;
        int vel = 0;

        casos = scanner.nextInt();

        for (int i=0;i<casos;i++){
            int metros = scanner.nextInt();
            int velocidad_tortuga = scanner.nextInt();
            int velocidad_liebre = scanner.nextInt();
            int min_libere_aguanta = scanner.nextInt();

            int vel_tortuga_act=velocidad_tortuga;

            //Velocidad tortuga
            vel = velocidad_tortuga-5;
            for (int a=0;a<vel;a++){
                pinicial_tortuga=pfinal_tortuga;
                vel_tortuga_act--;
                System.out.println(vel_tortuga_act);
                pfinal_tortuga= pinicial_tortuga + (vel_tortuga_act*10);
                System.out.println(pfinal_tortuga);
            }
        }
    }
}
