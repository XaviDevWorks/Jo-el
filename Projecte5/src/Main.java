import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int coche=73490;
        System.out.println("Tienes el modelo full equip?");
        System.out.println("1. Si tengo el modelo full equip");
        System.out.println("2. No tengo el modelo full equip");
        int opt= input.nextInt();

        switch (opt){
            case 1:
                int coche1=coche+20000;
                System.out.println("Cuantos Km tiene el vehiculo?");
                int ka= input.nextInt();
                double DPa=ka*0.00001;
                double Pa= (100-DPa);
                double va=Pa/100;
                double VFa=coche1*va;
                System.out.println("El valor del vehiculo sera de un total de:"+VFa);
                break;
            case 2:
                System.out.println("Cuantos Km tiene el vehiculo?");
                int k= input.nextInt();
                double DP=k*0.00001;
                double P=100-DP;
                double v=P/100;
                double VF=coche*v;
                System.out.println("El valor del vehiculo sera de un total de:"+VF);
                break;
        }

        input.close();
    }
}