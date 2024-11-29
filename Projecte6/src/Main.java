import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flg=true;

        while(flg) {
            System.out.println("Cuantos litros hay por metro cuadrado?");
            int l = input.nextInt();
            if (l<=90){
                System.out.println("No ha superado los 90L por metro cuadrado");
            }
            else{
                System.out.println("Abriendo puertas");
                flg=false;
            }
        }

    }
}