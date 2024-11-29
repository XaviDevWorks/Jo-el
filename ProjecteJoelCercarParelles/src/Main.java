import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num==num1||num1==num2||num==num2){
            System.out.println("SI");
        }
        else{
            System.out.println("NO");
        }
    }
}
