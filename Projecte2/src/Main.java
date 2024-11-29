import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean flg=true;

        while(flg){
            System.out.printf("Eres un cliente vip?");
            System.out.println("1. Si lo soy");
            System.out.println("2. No lo soy");
            int opcion = input.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("Cuanto va a ser el total a pagar?");
                    double pre =input.nextInt();
                    pre=pre/1.20;
                    System.out.println("El precion con el descuento de cliente VIP sera de: "+ pre);
                    flg=false;
                    break;
                case 2:
                    System.out.println("Cuanto va a ser el total a pagar?");
                    double precio = input.nextInt();
                    if(precio>200){
                        pre=precio/1.20;
                        System.out.println("El precio total con descuento es:"+ pre);
                        flg=false;

                    }
                    else {
                        System.out.println("El precio sin decuento sera:"+ precio);
                        flg=false;
                    }
                    break;
                case 3:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}

