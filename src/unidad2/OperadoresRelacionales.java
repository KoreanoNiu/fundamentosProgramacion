package unidad2;
import java.util.Scanner;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean resultado = 10 <= 10;
        System.out.println("Resultado = " + resultado);

        double numero1;
        double numero2;
        System.out.println("Ingresa el numero 1");
        numero1 = teclado.nextDouble();
        System.out.println("Ingresa el numero 2");
        numero2 = teclado.nextDouble();
        resultado = numero1 > numero2;
        System.out.println("El numero 1 es mayor que el numero 2: " + resultado);

        teclado.close();
    }
}
