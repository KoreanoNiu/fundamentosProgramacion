package unidad2;
import java.util.Scanner;

public class EjercicioOperadoresAsignacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double resultado = 5;
        double otroValor = 0;
        
        System.out.println("Ingresa el valor que quieras sumar: ");
        otroValor = teclado.nextDouble();
        resultado += otroValor;
        System.out.println("El resultado de la suma (+=) de los numeros es: " + resultado);

        System.out.println("\nIngresa el valor que quieras restar:");
        otroValor = teclado.nextDouble();
        resultado -= otroValor;
        System.out.println("El resultado de la resta (-=) de los numeros es: " + resultado);

        System.out.println("\nIngresa el valor por el que quieras multiplicar:");
        otroValor = teclado.nextDouble();
        resultado *= otroValor;
        System.out.println("El resultado de la multiplicacion (*=) de los numeros es: " + resultado);

        System.out.println("\nIngresa el valor por el que quieras dividir:");
        otroValor = teclado.nextDouble();
        resultado /= otroValor;
        System.out.println("El resultado de la división (/=) de los numeros es: " + resultado);

        teclado.close();
    }
}
