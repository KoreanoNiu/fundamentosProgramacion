package unidad3;
import java.util.Scanner;

public class Ejercicio3_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1  = 0;
        int numero2 = 0;
        int resultado;

        System.out.println("Ingrese un numero: ");
        numero1 = teclado.nextInt();
        System.out.println("Ingrese un numero: ");
        numero2 = teclado.nextInt();

        resultado = numero1 *numero2;

        if (resultado > 100) {
            System.out.println("El producto es valido");
        }
        if ((numero1 * numero2) > 100) {
            System.out.println("El producto es valido");
        }

        teclado.close();
    }
}
