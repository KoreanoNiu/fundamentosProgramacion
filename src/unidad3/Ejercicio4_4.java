package unidad3;
import java.util.Scanner;

public class Ejercicio4_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre = "";
        char letra;

        System.out.println("Ingresa tu nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingresa una letra: ");
        letra = teclado.next().charAt(0);

        if (nombre.equals("SantaAna") && letra == 'Y' ) {
            System.out.println("Datos validos");
        }

        teclado.close();
    }
}
