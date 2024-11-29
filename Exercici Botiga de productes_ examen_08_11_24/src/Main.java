import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int menu;
        int contadorProductes = 0;
        int continuar = 0;
        int filtre = 0;
        String[] nomProductes = new String [1000];
        float [][] valorsProductes = new float [1000][2];//el primero es las filas y es el numero de nomproductes
        //El 2 es de precio y cantidad.

        //Menú
        System.out.println("------------------------------------");
        System.out.println("Bienvenido al programa StockManager!");
        System.out.println("------------------------------------");
        System.out.println();
        do{
            System.out.println("Escoge una opción: \n" +
                    "1. Añadir producto\n" +
                    "2. Mostrar inventario \n" +
                    "3. Enseñar producto según identificador \n" +
                    "4. Salir"
            );
            System.out.println();
            menu= input.nextInt();
            
            switch (menu){
                case 1:
                    // Opción introducion de nuevo producto
                    System.out.println("Has escogido introducir productos.");
                    System.out.println("Nombre: ");
                    nomProductes[contadorProductes]= input.next();
                    System.out.println("Precio: ");
                    valorsProductes[contadorProductes][0]=input.nextFloat();
                    System.out.println("Stock: ");
                    valorsProductes[contadorProductes][1]=input.nextFloat();

                    contadorProductes++;
                    break;
                case 2:
                    System.out.println("Has escogido mostrar productos.");
                    for(int i=0; i < contadorProductes; i++){// contador porque tiene que pasar tantas veces como el contador, recorre productos
                        System.out.print(nomProductes[i] + " |   ");
                        for (int j=0;j < 2; j++){//El 2 es el dos del array valors productes, recorre info
                            System.out.print(valorsProductes[i][j] + " |   ");
                        }
                        System.out.println("\n------------------------------------");
                    }
                    break;
                case 3:
                    System.out.println("Has escogido buscador de producto");
                    for (int i = 0; i < contadorProductes; i++){
                        System.out.println((i+1) + ".  " + nomProductes[i]);
                    }

                    do{
                        filtre =input.nextInt();
                        if (filtre > contadorProductes){
                            System.out.println("Producto inexsistente, escoge otro.");
                        }
                    }while(filtre>contadorProductes);

                    System.out.print(nomProductes[filtre-1] + " |   ");
                    for (int j=0;j < 2; j++){//El 2 es el dos del array valors productes, recorre info
                        System.out.print(valorsProductes[filtre-1][j] + " |   ");
                    }
                    System.out.println("\n------------------------------------");

                    break;
                case 4:
                    System.out.println("Has escogido salir del programa.");
                    System.out.println("Cerrando...");
                    break;
                default:
                    System.out.println("Error.");
            }
            System.out.println( "\nVols continuar? \n" +
                    "1. Si \n" +
                    "2. No"
            );
            continuar = input.nextInt();
        }while (continuar == 1);
    }
}