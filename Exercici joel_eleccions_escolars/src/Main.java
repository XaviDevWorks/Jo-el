import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int x = scan.nextInt();

        String [][] array = new String[x][x];


        for (int i = 0; i<x; i++){
            for(int k = 0; k<x; k++){
                if(i == k){
                    array[i][k] = "X";
                }
                else if(i == 0){
                    array[i][k] = "X";
                }
                else if(k==0){
                    array[i][k] = "X";
                }
                else if(i == x-1){
                    array[i][k] = "X";
                }
                else if(k == x-1){
                    array[i][k] = "X";
                }
                else{
                    array[i][k] = ".";
                }
            }
            array[i][x-i-1] = "X";
        }
        for (int i = 0; i<x; i++){
            for(int k = 0; k<x; k++){
                System.out.print(array[i][k]);
            }
            System.out.println();
        }
    }
}