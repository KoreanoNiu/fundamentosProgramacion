package unidad2;

import java.util.Scanner;

public class Lectura1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Variable para guardar la cantidad de hermanos
        int cantidadHermanos = 0;
        System.out.println("Ingresa la cantidad de hermanos que tienes: ");

        //Lectura de datos
        cantidadHermanos = teclado.nextInt();

        //Mostramos la cantidad ingresada
        System.out.println("La cantidad ingresada es: " + cantidadHermanos);

        teclado.close();
    }
}
