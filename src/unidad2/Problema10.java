package unidad2;
import java.util.Scanner;

public class Problema10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sueldo = 0;
        double comision = 0;
        double sueldoTotal = 0;

        System.out.println("Cuánto es tu sueldo base?");
        sueldo = teclado.nextDouble();

        for (int i = 0; i < 3; i++) {
             System.out.println("Ingresa la venta " + (i + 1) + ": ");
             comision = comision + teclado.nextDouble();
        }
        
        comision =  comision * 0.1;
        sueldoTotal = sueldo + comision;

        System.out.println("El sueldo base es: \t\t" + sueldo );
        System.out.println("La comision del mes es: \t" + comision);
        System.out.println("───────────────────────────────────────");
        System.out.println("El sueldo total del mes es: \t" + sueldoTotal);

       teclado.close();
    }
}
