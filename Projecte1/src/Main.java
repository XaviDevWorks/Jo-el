import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean flg = true;
        while(flg) {
            System.out.print("Dame un numero en positivo: ");
            int num = input.nextInt();

            if (num >= 0 && num <= 10) {
                System.out.println("El numero es correcto");
                //flg = false;
            } else {
                System.out.println("Error");
            }

            System.out.print("Dame un segundo numero en positivo: ");
            int num2 = input.nextInt();

            if (num2 >= 0 && num2 <= 10) {
                System.out.println("El numero es correcto");
                flg = false;
            } else {
                System.out.println("Error");
            }
        }
    }
}