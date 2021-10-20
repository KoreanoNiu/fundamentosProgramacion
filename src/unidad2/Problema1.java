package unidad2;
import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura = 0;
        double base = 0;
        double area = 0;
        
        //Entrada
        System.out.println("Ingresa la base del rectangulo: ");
        base = teclado.nextDouble();
        System.out.println("Ingresa la altura del rectangulo: ");
        altura = teclado.nextDouble();
        
        //Proceso
        area = base * altura;
        
        //Salida
        System.out.println("El área del rectángulo es = " + area);
        teclado.close();
    }
}
