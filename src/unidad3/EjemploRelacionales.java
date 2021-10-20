package unidad3;
import java.util.Scanner;

public class EjemploRelacionales {
    public static void main( String[] args ) {
        Scanner teclado = new Scanner(System.in);
        int edad = 0;
        String estadoCivil = "";
        System.out.println("Ingresa tu edad: ");
        edad = teclado.nextInt();
        System.out.println("Ingresa tu estado civil: ");
        estadoCivil = teclado.nextLine();

        if (edad >= 18 && estadoCivil.equalsIgnoreCase("soltero")) {
            System.out.println("Puedes casarte");
        }

        teclado.close();
    }
}
