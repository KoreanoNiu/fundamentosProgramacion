package unidad3;
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio4_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Ingresa el numero 1: ");
        numero1 = teclado.nextInt();
        System.out.println("Ingresa el numero 2: ");
        numero2 = teclado.nextInt();

        if ((numero1 + numero2) >= 100 || (numero1 * numero2) >= 100) {
            System.out.println(Math.pow(numero1, 3));
        }

        teclado.close();
    }
}
