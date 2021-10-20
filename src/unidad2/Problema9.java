package unidad2;
import java.util.Scanner;

public class Problema9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       double precioAutomovil = 0;
       double total = 0;

        //Entrada
        System.out.println("¿Cuál es el precio del automóvil?");
        precioAutomovil = teclado.nextDouble();

        //Proceso
        total = precioAutomovil + (precioAutomovil * 0.15);

       //Salida
       System.out.println("Sub total:  \t\t" + "$" +precioAutomovil);
       System.out.println("─────────────────────────────────");
       System.out.println("Total:  \t\t" + "$" + total);
       
       teclado.close();
    }
}
