import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        for (int i=0; i<=4; i++){
            int num= scanner.nextInt();
            if (num<=30 && num>0){
                contador++;
            }
        }
        System.out.println(contador);
    }
}