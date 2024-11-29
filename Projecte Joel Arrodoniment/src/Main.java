import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double nota = scanner.nextDouble();

        if (nota % 1 >= 0.5) {
            nota =(int) (nota + 1);
        }
        else {
            nota =(int)(nota);
        }
        System.out.println(nota);
    }
}