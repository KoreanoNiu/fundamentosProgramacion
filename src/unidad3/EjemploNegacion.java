package unidad3;
import java.util.Scanner;

public class EjemploNegacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = "";
        final String NOMBRE_USUARIO_VALIDO = "admin";
        System.out.println("Ingresa el nombre de la persona: ");
        nombre = teclado.nextLine();

        if (! nombre.equalsIgnoreCase(NOMBRE_USUARIO_VALIDO)) {
            System.out.println("Acceso permitido");
        }

        teclado.close();
    }
}
