import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] maximo = new int[10];
        for (int i=0;i< maximo.length;i++){
            maximo[i]= scanner.nextInt();
        }
        int valmaximo = 0;
        for (int i=0;i<maximo.length;i++){
            if(maximo[i]>=valmaximo){
                valmaximo=maximo[i];
            }
        }
        System.out.println(valmaximo);
    }
}
