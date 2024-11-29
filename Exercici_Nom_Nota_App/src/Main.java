import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Holaa");

        String [][] pelis = {
                                {"Anatomia de grey", "9,9", "Netflix"},
                                {"Fast ad furious", "8,5", "HBO"},
                                {"Jumanji", "6,5", "Prime video"},
                             };

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j ++){
                System.out.print(pelis[i][j]+" ");
            }
            System.out.println("        ");
        }
    }
}