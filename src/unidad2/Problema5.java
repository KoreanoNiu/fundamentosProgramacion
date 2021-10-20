package unidad2;
import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double gradosCentigrados = 0;
        double gradosFahrenheit = 0;
        
        //Entrada
        System.out.println("Ingresa la temperatura en grados centigrados: ");
        gradosCentigrados = teclado.nextDouble();
        
        //Proceso
        gradosFahrenheit = (1.8 * gradosCentigrados) + 32;
        
        //Salida
        System.out.println(gradosCentigrados + "°C = " + gradosFahrenheit + "°F");
        
        teclado.close();
    }
}
