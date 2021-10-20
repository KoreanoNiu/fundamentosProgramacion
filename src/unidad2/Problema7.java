package unidad2;
import java.util.Scanner;

public class Problema7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double COSTO_HUEVOS = 15;
        final double COSTO_TORTA = 8;
        final double COSTO_HAMBURGESA = 12;
        final double COSTO_SANDWICH = 6;
        final double COSTO_REFRESCO = 4;
        final double COSTO_CAFE = 3;
        final double COSTO_JUGO = 2;
        double cantidad = 0;
        double total = 0;
 
        //Mostrar menu
        System.out.println("Huevos al gusto \t" + COSTO_HUEVOS);
        System.out.println("Torta \t\t\t" + COSTO_TORTA);
        System.out.println("Hamburgesa \t\t" + COSTO_HAMBURGESA);
        System.out.println("Sandwich \t\t" + COSTO_SANDWICH);
        System.out.println("Refrescos \t\t" + COSTO_REFRESCO);
        System.out.println("Cafe \t\t\t" + COSTO_CAFE);
        System.out.println("Jugo \t\t\t" + COSTO_JUGO);

        //Cantidad de alimentos y suma a la cuenta
        System.out.println("¿Cuantos huevos te comiste? ");
        cantidad = teclado.nextDouble();
        total = COSTO_HUEVOS * cantidad;
 
        System.out.println("¿Cuantas tortas consumiste?");
        cantidad = teclado.nextDouble();
        total = total + (COSTO_TORTA * cantidad);

        System.out.println("¿Cuantas hamburgesas comiste?");
        cantidad = teclado.nextDouble();
        total = total + (COSTO_HAMBURGESA * cantidad);

        System.out.println("¿Cuantos sandwiches consumiste?");
        cantidad = teclado.nextDouble();
        total = total + (COSTO_SANDWICH * cantidad);

        System.out.println("¿Cuantos refrescos bebiste?");
        cantidad = teclado.nextDouble();
        total = total + (COSTO_REFRESCO * cantidad);

        System.out.println("¿Cuantos cafes tomaste?");
        cantidad = teclado.nextDouble();
        total = total + (COSTO_CAFE * cantidad);

        System.out.println("¿Cuantas jugos consumiste?");
        cantidad = teclado.nextDouble();
        total = total + (COSTO_JUGO * cantidad);
 
        System.out.println("Subtotal:  \t" +"$" + total );
        System.out.println("──────────────────────");
        //proceso
        total += total * 0.15;
        System.out.println("Total:  \t" + "$" + total);
        
        teclado.close();
    }
}
