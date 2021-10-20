package unidad2;
import java.util.Scanner;

public class Problema19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double anguloA = 0;
        double anguloB = 0;
        double anguloC = 0;

        System.out.println("Ingresa el valor del angulo A: ");
        anguloA = teclado.nextDouble();

        System.out.println("Ingresa el valor del angulo B: ");
        anguloB = teclado.nextDouble();

        anguloC = 180 - (anguloA + anguloB);

        System.out.println("El valor del angulo C es: " + anguloC);

        teclado.close();
    }
}
