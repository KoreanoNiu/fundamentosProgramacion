package unidad3;
import java.util.Scanner;

public class Ejercicio4_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double compra1 = 0;
        double compra2 = 0;
        double compra3 = 0;
        double subTotal = 0;
        double precioTotal = 0;

        System.out.println("Monto de la compra 1: ");
        compra1 = teclado.nextInt();
        System.out.println("Monto de la compra 2: ");
        compra2 = teclado.nextInt();
        System.out.println("Monto de la compra 3: ");
        compra3 = teclado.nextInt();

        subTotal = compra1 + compra2 + compra3;

        if (subTotal > 1000) {
            precioTotal =  subTotal - (subTotal * 0.12);
        }
        System.out.println("El monto de la compra 1: $" + compra1);
        System.out.println("El monto de la compra 2: $" + compra2);
        System.out.println("El monto de la compra 3: $" + compra3);

        System.out.println("El subtotal a pagar es: $" + subTotal);
        System.out.println("El total a pagar es: $" + precioTotal);
        teclado.close();
    }
}
