    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double dinero = 0;
            double cript = 0;
            double bit = 32296.53;
            double eth = 1693.80;

            boolean flg = true;

            while (flg==true){
                System.out.println("Hola, bienvenido");
                System.out.println("Menu:");
                System.out.println("1. Comprar Bitcoin");
                System.out.println("2. Comprar Ethereum");
                System.out.println("3. Salir aplicación");
                int num = scanner.nextInt();

                switch(num){
                    case 1:
                        if (dinero >= 1 && dinero <= 1000) {
                            System.out.println("Cuanto dinero quiere invertir? (Debe ser entre 1 y 1000 euros)");
                            dinero = scanner.nextDouble();
                            cript = dinero / bit;
                            System.out.println("Usted ha invertido: " + dinero + " Euros y ha comprado Bitcoin: " + cript);
                            flg =false;
                        }
                        else {
                            System.out.println("Error: el monto debe ser entre 1 y 1000 euros.");
                        }
                        break;

                    case 2:
                        System.out.println("Cuanto dinero quiere invertir? (Debe ser entre 1 y 1000 euros)");
                        dinero = scanner.nextDouble();
                        if (dinero >= 1 && dinero <= 1000) {
                            cript = dinero / eth;
                            System.out.println("Usted ha invertido: " + dinero + " Euros y ha comprado Bitcoin: " + cript);
                            flg =false;
                        }
                        else {
                            System.out.println("Error: el monto debe ser entre 1 y 1000 euros.");
                        }
                        break;

                    case 3:
                        System.out.println("Cerrando programa");
                        flg = false;
                        break;

                    default:
                        System.out.println("Error");
                }
            }
        }
    }