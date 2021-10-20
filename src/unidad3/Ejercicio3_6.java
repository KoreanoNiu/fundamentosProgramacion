package unidad3;
import java.util.Scanner;

public class Ejercicio3_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero  = 0;
        boolean resultado;
        System.out.println("Ingrese un numero: ");
        numero = teclado.nextInt();
        resultado = numero > 0;
        if (resultado) {
            System.out.println("El numero(" + numero + ") es mayor a 10");
        }

        teclado.close();
    }
}
