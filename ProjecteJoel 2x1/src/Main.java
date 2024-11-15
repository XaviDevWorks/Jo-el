import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3=num1*2;

        if (num2==num3){
            System.out.println("SI");
        }
        else{
            System.out.println("NO");
        }
    }
}