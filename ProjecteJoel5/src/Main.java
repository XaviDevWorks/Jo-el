import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia = input.nextInt();

        if (dia >= 1 && dia <= 31) {
            System.out.println("1");
        }
        else if (dia >= 32 && dia <= 59) {
            System.out.println("2");
        }
        else if (dia >= 60 && dia <= 90) {
            System.out.println("3");
        }
        else if (dia >= 91 && dia <= 120) {
            System.out.println("4");
        }
        else if (dia >= 121 && dia <= 151) {
            System.out.println("5");
        }
        else if (dia >= 152 && dia <= 181) {
            System.out.println("6");
        }
        else if (dia >= 182 && dia <= 212) {
            System.out.println("7");
        }
        else if (dia >= 213 && dia <= 243) {
            System.out.println("8");
        }
        else if (dia >= 244 && dia <= 273) {
            System.out.println("9");
        }
        else if (dia >= 274 && dia <= 304) {
            System.out.println("10");
        }
        else if (dia >= 305 && dia <= 334) {
            System.out.println("11");
        }
        else if (dia >= 335 && dia <= 365) {
            System.out.println("12");
        }
        else{
            System.out.println("Error");
        }
    }
}