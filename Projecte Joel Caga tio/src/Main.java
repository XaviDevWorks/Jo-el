import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        for (int i = 0; i < casos; i++) {
            int n = (scan.nextInt());
            n++;
            n/=2;
            System.out.print("Caga ");
            for (int j = 1; j < n; j++) {
                System.out.print("caga");
            }
            System.out.println("tio!");
        }
        scan.close();
    }
}