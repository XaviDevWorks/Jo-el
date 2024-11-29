import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello and welcome!");

        boolean flg=true;
        boolean flg2=true;
        while (flg=true){
            System.out.println("Cuantos dias te vas a quedar?");
            int dia= input.nextInt();

            if (dia>0){
                System.out.println("Cuantas personas van a ser?");
                int per= input.nextInt();
                if (per>0) {
                    while (flg2=true){
                        System.out.println("Cuantos dias te vas a quedar a comer?");
                        int com= input.nextInt();
                        if (com<dia && com<0){
                            System.out.println("Has selecionado comida por persona: "+com);

                            System.out.println("A que hora te vas a ir?");
                            int horario=input.nextInt();
                            if (horario>=0 && horario<=24){
                                if (horario<12){
                                    int total=per*(com*20+dia*20);
                                    System.out.println("El precio total saliendo antes de las 12am sera de: " +total);
                                }
                                else{
                                    int total=per*((com*20+dia*20)+15);
                                    System.out.println("El precio total saliendo despues de las 12am sera de: " +total);
                                }
                            }
                            else{
                                System.out.println("El horario debe ser entre las 0 y 24 horas");
                            }
                            flg2=false;
                        }
                        else{
                            System.out.println("El numero de comidas debe ser menor al dias de estancia.");
                        }
                    }
                }
                else{
                    System.out.println("Debes de seleccionar minimo a una persona.");
                }
            }
            else{
                System.out.println("Debes seleccionar minimo un dia.");
            }
        }
    }
}