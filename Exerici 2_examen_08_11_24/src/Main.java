import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int suma = 0;
        int num=0;
        boolean flg = true;

        while(flg){
            for(int i=0;i<100;i++){
                suma=suma+num;
                num++;
            }
            flg=false;
        }
        System.out.println(suma);
    }
}