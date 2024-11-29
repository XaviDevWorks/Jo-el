import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra= scanner.next();


        switch (palabra) {
            case "Coratge":
                System.out.println("Gryffindor");
                break;
            case "Coneixement":
                System.out.println("Ravenclaw");
                break;
            case "Ambicio":
                System.out.println("Slytherin");
                break;
            default:
                System.out.println("Hufflepuff");
                break;
        }
    }
}