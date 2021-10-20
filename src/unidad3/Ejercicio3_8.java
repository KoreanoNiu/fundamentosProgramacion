package unidad3;
import java.util.Scanner;

public class Ejercicio3_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double cantidad  = 0;
        double total = 0;
        System.out.println("Ingrese un numero: ");
        cantidad = teclado.nextDouble();
        if (cantidad > 2000) {
            total = cantidad - (cantidad * 0.15);
            System.out.println("El total es: " + total);
        }

        teclado.close();
    }
}
