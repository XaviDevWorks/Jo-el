import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][]array1 = new int [3][3];

        for (int i=0;i< array1.length;i++){
            for (int j=0;j< array1.length;j++){
                array1[i][j]= scanner.nextInt();
            }
        }
        boolean flg=false;
        boolean flg1=false;
        for (int j=0;j<3;j++) {
            if (array1[j][1] - array1[j][0] == array1[j][2] - array1[j][1]) {
                flg = true;
            }
            else {
                flg=false;
                break;
            }
        }
        for (int j=0;j<3;j++) {
            if (array1[1][j] - array1[0][j] == array1[2][j] - array1[1][j]) {
                flg1 = true;
            }
            else {
                flg1=false;
                break;
            }
        }
        if(flg && flg1){
            System.out.println("si");
        } else{
            System.out.println("no");
        }
    }
}