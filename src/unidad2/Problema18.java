package unidad2;
import java.util.Scanner;

public class Problema18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precioArticulo = 0;
        double precioVenta = 0;

        System.out.println("Ingresa cuanto te costo el producto: ");
        precioArticulo = teclado.nextDouble();

        precioVenta = precioArticulo + (precioArticulo * 0.3);

        System.out.println("El vendedor debe dar el producto en: " + precioVenta);

        teclado.close();
    }
}
