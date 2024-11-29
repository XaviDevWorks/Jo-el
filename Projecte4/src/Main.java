import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("¿Cuántos niños hay?");
        int niños = input.nextInt();
        System.out.println("¿Cuántas niñas hay?");
        int niñas = input.nextInt();
        int total = niños + niñas;

        double pniños =(double)niños/total*100;
        double pniñas =(double)niñas/total*100;

        System.out.printf("El porcentaje de niños es: %.2f%%\n", pniños);
        System.out.printf("El porcentaje de niñas es: %.2f%%\n", pniñas);

        input.close();
    }
}