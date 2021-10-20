package unidad2;
import java.util.Scanner;

public class Problema15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] nota = new double[]{0,0,0,0,0};
        double[] promedio = new double[] {0,0};
        double promedioFinal = 0;

        for (int i = 0; i < nota.length; i++) {
            System.out.println("Ingresa el la calificacion (1-10) de la nota " + (i + 1) + ": ");
            nota[i] = teclado.nextDouble();
        }
       
       promedio[0] = (nota[0] + nota[1]) / 2;
       promedio[1] = (nota[2] + nota[3]) / 2;
       promedioFinal = promedio[0] + promedio[1] + nota[4];

       System.out.println("El promedio de la nota 1 y 2 es: " + promedio[0]);
       System.out.println("El promedio de la nota 3 y 4 es: " + promedio[1]);
       System.out.println("El promedio final es: " + promedioFinal);

       teclado.close();
    }
}
