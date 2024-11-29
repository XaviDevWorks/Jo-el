import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numcaramels = input.nextInt();
        int numnens = input.nextInt();

            int resta= numcaramels%numnens;
            System.out.println(resta);
    }
}