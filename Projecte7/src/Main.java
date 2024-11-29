import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean flg=true;
        int salario=1250;
        int r=250;

        while(flg){
            System.out.println("has hecho horas extra?");
            System.out.println("1. Si he hecho");
            System.out.println("2. No he hecho");
            int opt= input.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Tienes riesgo de peligrosidad?");
                    System.out.println("1. Si tengo riego de peligrosidad");
                    System.out.println("2. No tengo riesgo de peligrosidad");
                    int riesgo = input.nextInt();
                    switch (riesgo) {
                        case 1:
                            System.out.println("Cuantas horas extra has hecho?");
                            int h = input.nextInt();
                            int salario1 = salario + r;
                            if (h > 5) {
                                double a1 = 5 * 20;
                                double a3 = h - 5;
                                double a2 = a3 * 17;
                                double a = a1 + a2;
                                double s = salario1 + a + r;
                                System.out.println("La nomina con horas extra incluidas sera de:" + s);
                            } else {
                                int a = h * 20;
                                double s = salario + a + r;
                                System.out.println("La nomina con horas extra incluidas sera de:" + s);
                            }
                             break;
                        case 2:
                            System.out.println("Cuantas horas extra has hecho?");
                            int h1 = input.nextInt();
                            if (h1 > 5) {
                                int a1 = 5 * 15;
                                int a3 = h1 - 5;
                                int a2 = a3 * 12;
                                int a = a1 + a2;
                                int s = salario + a;
                                System.out.println("La nomina con horas extra incluidas sera de:" + s);
                            } else {
                                int a = h1 * 15;
                                int s = salario + a;
                                System.out.println("La nomina con horas extra incluidas sera de:" + s);
                            }
                             break;
                        case 3:
                            System.out.println("Operacion no valida");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Tienes riesgo de peligrosidad?");
                    System.out.println("1. Si tengo riego de peligrosidad");
                    System.out.println("2. No tengo riesgo de peligrosidad");
                    int riesgo1 = input.nextInt();
                    switch (riesgo1) {
                        case 1:
                            int s1 = salario + r;
                            System.out.println("La nomina con horas extra incluidas sera de:" + s1);
                            break;
                        case 2:
                            int s2=salario;
                            System.out.println("La nomina con horas extra incluidas sera de:" + s2);
                            break;
                        case 3:
                            System.out.println("Operacion no valida");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Operación no valida");
                    break;
            }
        flg=false;
        input.close();
        }
    }
}