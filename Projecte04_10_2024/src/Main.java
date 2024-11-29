import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        int acumulado=0;
        double media=0;
        System.out.printf("Cuantos numeros quieres?");
        int numeros= imput.nextInt();

        for (int i = 1; i <= numeros; i++) {
            System.out.println("Escribe el numero");
            int num= imput.nextInt();
            acumulado=acumulado + num;
        }
        media =acumulado/numeros;
        System.out.println(media);
    }
}