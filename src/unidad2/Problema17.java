package unidad2;
import java.util.Scanner;

public class Problema17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double herenciaTotal = 0;
        double[] herencia = new double[] {0,0,0,0};

        System.out.println("Ingresa la cantidad e la herencia: ");
        herenciaTotal = teclado.nextDouble();

        herencia[0] = herenciaTotal * 0.30;
        herencia[1] = herenciaTotal * 0.25;
        herencia[2] = herenciaTotal * 0.35;
        herencia[3] = herenciaTotal * 0.1;

        System.out.println("La herencia del hijo mayor es: \t\t" + herencia[0]);
        System.out.println("La herencia del hijo de en medio es:\t" + herencia[1]);
        System.out.println("La herencia del hijo menor es: \t\t" + herencia[2]);
        System.out.println("La herencia de la esposa es: \t\t" + herencia[3]);

        teclado.close();
    }
}
