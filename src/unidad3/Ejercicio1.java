package unidad3;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        double calificacion = 0;
        final double CALIFICACION_APROBATORIA = 70;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la calificacion del parcial: ");
        calificacion = teclado.nextDouble();

        if (calificacion > CALIFICACION_APROBATORIA) {
            System.out.println("Felicidades, aprobaste!!");
        } else{
            System.out.println("No lograste aprobar la materia, echale más ganas");
        }
        teclado.close();
    }
}
