package unidad2;
import java.util.Scanner;

public class Problema14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precioPromedio = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa el precio del producto en la tienda " + (i + 1) + ": ");
            precioPromedio += teclado.nextDouble();
        }
       
       precioPromedio = precioPromedio / 3;

       System.out.println("El precio promedio del producto es: $" + precioPromedio);

       teclado.close();
    }
}
