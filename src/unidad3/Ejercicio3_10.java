package unidad3;
import java.util.Scanner;

public class Ejercicio3_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = "";
        System.out.println("Ingresa el nombre de la persona: ");
        nombre = teclado.nextLine();

        if (nombre.equals("Eduardo")) {
            System.out.println("Acceso autorizado");
        } else {
            System.out.println("Acceso denegado");
        }
        teclado.close();
    }
}
