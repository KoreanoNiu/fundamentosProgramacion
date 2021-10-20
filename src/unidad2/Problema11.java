package unidad2;
import java.util.Scanner;

public class Problema11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] credito = new double[2];
        double total = 0;

        for (int i = 0; i < credito.length; i++) {
             System.out.println("Ingresa la cantidad del prestamo " + (i + 1) + ": ");
             credito[i] =  teclado.nextDouble();
        }
        
        credito[0] += credito[0] * 0.26;
        credito[1] += credito[1] * 0.35;
        total = credito[0] + credito[1];

        for (int i = 0; i < credito.length; i++) {
            System.out.println("El total a pagar del prestamo " + (i + 1) + " es: \t\t" + credito[i]);
        }
        System.out.println("───────────────────────────────────────────────────────");
        System.out.println("El total a pagar por ambos prestamos es: \t" + total);

        teclado.close();
    }
}
