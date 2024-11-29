import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1==num2){
            System.out.println("No");
        }
        else{
            if (num1>num2) {
                System.out.println("Jiden");
            }
            else{
                System.out.println("Drump");
            }
        }

    }
}