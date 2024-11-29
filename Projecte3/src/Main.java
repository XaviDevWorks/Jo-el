import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Cuanto te ha costado la figura?");
        int pre = input.nextInt();
        System.out.println("Se encuentra en buen estado?");
        System.out.println("1. Si se encuentra en buen estado");
        System.out.println("2. No se encuentra en buen estado");
        int opt = input.nextInt();

        switch (opt){
            case 1:
                double pre_1=pre*1.25;
                System.out.println("El producto que compraste lo venderas por: " +pre_1);
                break;
            case 2:
                double pre_2=pre*1.10;
                System.out.println("El producto que compraste lo venderas por: " +pre_2);
                break;
            case 3:
                System.out.println("Opcion no valida");
                break;
        }

    }
}