import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aqui tienes el programa 3 de matrices");

        String [] [] array = new String[5][5];

        int conti=0;
        int contj=4;
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++){
                if(i==j){
                    array [i][j] = ("X ");
                }
                else{
                    array [i][j] = ("  ");
                }


            }
            array[conti][contj] = ("X ");
            conti++;
            contj--;
        }

        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}