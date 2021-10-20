package unidad3;
import java.util.Scanner;

public class Ejercicio4_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;

        System.out.println("Ingresa el numero 1: ");
        numero1 = teclado.nextInt();
        System.out.println("Ingresa el numero 2: ");
        numero2 = teclado.nextInt();
        System.out.println("Ingresa el numero 3: ");
        numero3 = teclado.nextInt();

        if (numero1 > numero2 && numero1 <  numero3) {
            System.out.println(numero1 + " *  " + numero2 + " * " + numero3 + " = " + (numero1 * numero2 * numero3));
        }

        teclado.close();
    }
}
