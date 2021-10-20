package unidad3;
import java.util.Scanner;

public class Ejercicio3_11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char letra;
        System.out.println("Ingresa un caracter: ");
        letra = teclado.next().charAt(0);

        if (letra == 'S') {
            System.out.println("Saliendo del sistema");
        }
        teclado.close();
    }
}
