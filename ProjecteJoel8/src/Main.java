import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num<32){
            System.out.println("SI");
        }
        else{
            System.out.println("NO");
        }
    }
}