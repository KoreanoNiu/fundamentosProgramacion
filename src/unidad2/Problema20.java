package unidad2;
import java.util.Scanner;

public class Problema20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precioQuintal = 0;
        double precioVenta = 0;

        System.out.println("Ingresa el precio del quintal de arroz: ");
        precioQuintal = teclado.nextDouble(); 

        precioQuintal += precioQuintal * 0.4;

        precioVenta = precioQuintal / 100; 

        System.out.println("El precio del kilogramo de arroz es: $" + precioVenta);

        teclado.close();
    }
}
