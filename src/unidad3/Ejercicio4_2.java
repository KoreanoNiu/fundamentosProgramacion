package unidad3;
import java.util.Scanner;

public class Ejercicio4_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Ingresa el numero 1: ");
        numero1 = teclado.nextInt();
        System.out.println("Ingresa el numero 2: ");
        numero2 = teclado.nextInt();

        if (numero1 > 10 && numero2 < 5) {
            System.out.println("Numeros aprobados");
        }

        teclado.close();
    }
}
