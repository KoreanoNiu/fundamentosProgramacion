package unidad3;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero  = 0;
        System.out.println("Ingresa un numero: ");
        numero = teclado.nextInt();
        if (numero == 777) {
            System.out.println("Felicidades!!!");
        } else{
            System.out.println("No fue el numero");
        }
        char letra;
        System.out.println("ingrese letra: ");
        letra = teclado.next().charAt(0);
        if(letra == 's')
        {
            System.out.println("Salir");
        }
        
        String nombre;
        final String NOMBRE_CORRECTO = "Carlos";
        teclado.nextLine();
        System.out.println("ingrese nombre: ");
        nombre = teclado.nextLine();
        if(nombre.equals(NOMBRE_CORRECTO))
        {
            System.out.println("Te llamas carlos");
        }
        teclado.close();
    }
}
