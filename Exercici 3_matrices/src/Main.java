import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aqui tienes el programa 3 de matrices");

        String [] [] array = new String[5][5];

        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++){
                if(i==j || i==0 || i==4){
                    array [i][j] = ("X ");
                }
                else{
                    array [i][j] = ("  ");
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}