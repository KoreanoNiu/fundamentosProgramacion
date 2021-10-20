package unidad2;
import java.util.Scanner;

public class Operadores {
    public static void main( String[] args ) {
        Scanner teclado = new Scanner(System.in);
        int operacion = ((3+6) * 10);
        System.out.println("Valor: " + operacion);

        double calificacion1 = 0;
        double calificacion2 = 0;
        double calificacion3 = 0;
        double promedio = 0;
        System.out.println("Ingrese la calificacion 1: ");
        calificacion1 = teclado.nextDouble();
        System.out.println("Ingrese la calificacion 2: ");
        calificacion2 = teclado.nextDouble();
        System.out.println("Ingrese la calificacion 3: ");
        calificacion3 = teclado.nextDouble();
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        
        System.out.println("El promedio de las 3 calificaciones es: " + promedio);

        teclado.close();
    }
}
