package unidad3;
import java.util.Scanner;

public class Ejercicio3_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad1  = 0;
        int cantidad2 = 0;
        int resultado = 0;
        System.out.println("Ingresa una cantidad: ");
        cantidad1 = teclado.nextInt();

        if (cantidad1 != 200) {
            System.out.println("Ingresa otra cantidad: ");
            cantidad2 = teclado.nextInt();
            resultado = cantidad1 + cantidad2;
            System.out.println("El resultado es: " + cantidad1 + "+" + cantidad2 + " = " + resultado);
        } else {
            resultado = cantidad1;
            System.out.println("El resultado es: " + resultado);
        }

        teclado.close();
    }
}
