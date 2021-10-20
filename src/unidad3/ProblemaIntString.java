package unidad3;
import java.util.Scanner;

public class ProblemaIntString {
    public static void main(String[] args) {
        String nombre;
        int numero1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        numero1 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingresa tu nombre");
        nombre = teclado.nextLine();
        System.out.println("Nombre ingresado: " + nombre);
        teclado.close(); 
    }
}
