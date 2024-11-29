import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido al programa de nuestra tienda!");

        int maxProductos = 10000; //Poner maximo de productos
        String[] nom = new String[maxProductos]; //Crear la array de un nombre, en string
        int[] preu = new int[maxProductos]; //Crear la array del precio en int
        int[] stock = new int[maxProductos]; //Crear la array del stock en int
        int cant = 0;
        boolean flg=true;
        while (flg) {
            //Creamos menu
            System.out.println("Inserta el número para acceder al programa: ");
            System.out.println("1. Añadir producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Enseñar producto según identificador");
            System.out.println("4. Salir");
            int tecla = input.nextInt(); //Recogemos el numero para entrar al menu
            input.nextLine();

            //Menu
            switch (tecla) {
                case 1:
                    if (cant < maxProductos) { //Comprobamos que la cantidad que tenemos no sea mayor al maximo de productos
                        System.out.println("Introduce el nombre del producto:");
                        nom[cant] = input.nextLine();
                        preu[cant] = input.nextInt();
                        stock[cant] = input.nextInt();
                        input.nextLine();
                        cant++; //Sumar cantidad de la lista
                        System.out.println("Producto añadido correctamente.");
                    }
                    break;
                case 2:
                    System.out.println("Aquí tienes el inventario:");
                    for (int i = 0; i < cant; i++) { //for para ir printeando toda la lista de productos
                        System.out.println("Nombre: " + nom[i]);
                        System.out.println("Precio: " + preu[i]);
                        System.out.println("Stock: " + stock[i]);
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("¿Qué producto quieres comprobar? (Introduce el número del producto):");
                    for (int i = 0; i < cant; i++) { // Imprimimos la lista de productos con su identificador
                        System.out.println("Producto " + (i + 1));
                        System.out.println("Nombre: " + nom[i]);
                        System.out.println("Precio: " + preu[i]);
                        System.out.println("Stock: " + stock[i]);
                        System.out.println();
                    }
                    int valorcomprobar = input.nextInt();
                    if (valorcomprobar >= 1 && valorcomprobar <= cant) {
                        // Restamos 1 a 'valorcomprobar' para obtener el índice correcto
                        System.out.println("Producto encontrado!");
                        System.out.println("Nombre: " + nom[valorcomprobar - 1]);
                        System.out.println("Precio: " + preu[valorcomprobar - 1]);
                        System.out.println("Stock: " + stock[valorcomprobar - 1]);
                    } else {
                        System.out.println("Identificador de producto no válido.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    flg=false; // Salir del programa
                    break;
                default:
                    System.out.println("Error: opción no válida."); //Correccion de errores.
            }
        }
    }
}
