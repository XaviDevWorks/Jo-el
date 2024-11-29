import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String matinit;
        if((num/43200)%2==0){
            matinit = "mati";
        }
        else{
            matinit = "Nit";
        }

        int dias= (num/86400)+1;
        System.out.println(matinit + " del dia "+ dias);

    }
}