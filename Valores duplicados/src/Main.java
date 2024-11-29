import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        int contador = 0;
        boolean flg=false;
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    contador++;
                    flg=true;
                }
            }
        }

        if(flg){
            System.out.println("Hay valores repetidos");
            System.out.println(contador);
        }else{
            System.out.println("No hay valores repetidos");
        }
    }
}