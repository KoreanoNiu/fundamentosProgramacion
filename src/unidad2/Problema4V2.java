package unidad2;
import java.util.Scanner;

public class Problema4V2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       double radio = 0;
       double area = 0;
        final double PI = 3.14159265359;
       //Entrada
       System.out.println("Ingresa el radio del circulo ");
       radio = teclado.nextDouble();

       //Proceso
       area = PI * (radio * radio);

       //Salida
       System.out.println("El área del trapecio es = " + area);
       teclado.close();
    }
}