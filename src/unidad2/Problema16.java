package unidad2;
import java.util.Scanner;

public class Problema16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sueldoMensual = 0;
        double sueldoAnual = 0;

        System.out.println("Ingresa el sueldo mensual del trabajador: ");
        sueldoMensual = teclado.nextDouble();

        sueldoAnual = sueldoMensual * 12;
        System.out.println("El sueldo total anual del trabajador sin impuestos es: \t" + sueldoAnual);
        System.out.println("──────────────────────────────────────────────────────────────────────────────────");
        sueldoAnual = sueldoAnual - (sueldoAnual * 0.07);
        System.out.println("El sueldo total anual del trabajador incluyendo sus impuestos es: \t" + sueldoAnual);

        teclado.close();
    }
}
