import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num>=1 && num<=2020){
            if (num>=1945 && num<=1965){
                System.out.println("ok boomer");
            }
            else{
                System.out.println("nah");
            }
        }
    }
}