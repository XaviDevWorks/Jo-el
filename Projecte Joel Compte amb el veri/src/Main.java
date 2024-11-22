import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        for (int i = 0; i < casos; i++) {
            int hp = scan.nextInt();
            int rammus = scan.nextInt();
            int twitch = scan.nextInt();
            int j;
            String asesino = null;
            for (j = 1; hp > 0; j++) {
                asesino = "RAMMUS";
                hp -= rammus;
                if (hp <= 0) {
                    break;
                }
                asesino = "TWITCH";
                hp -= twitch;
                if (hp <= 0) {
                    break;
                }
            }
            System.out.println(asesino + " " + j);
        }
        scan.close();
    }
}