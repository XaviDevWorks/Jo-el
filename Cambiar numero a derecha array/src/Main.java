import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        int ultimo = array[9];
        for (int i = array.length-1; i>0;i--) {
            array[i] = array[i-1];
        }

        array[0] = ultimo;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}