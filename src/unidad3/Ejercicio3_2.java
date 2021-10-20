package unidad3;
import java.util.Scanner;

public class Ejercicio3_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero  = 0;

        System.out.println("Ingrese un numero: ");
        numero = teclado.nextInt();
        if (numero >= 10) {
            System.out.println("El numero(" + numero + ")es mayor o igual a 10");
        }

        teclado.close();
    }
}
