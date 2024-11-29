import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minuts = scanner.nextInt();

        int hores=minuts/60;
        int restaminuts=minuts%60;

        System.out.println(hores + ":" + restaminuts);

    }
}
