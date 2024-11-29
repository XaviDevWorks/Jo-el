import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float m= scanner.nextFloat();
        float dinero=0;
        if (m<=25){
            dinero=m*3;
        }
        if (m>25&&m<=75){
            float metro1=m-25;
            dinero=(25*3)+(metro1*4);
        }
        if (m>75){
            float metro2=m-75;
            dinero=(25*3)+(50*4)+(metro2*5);
        }
        System.out.println(m+"m: "+dinero+ " euros");
    }
}