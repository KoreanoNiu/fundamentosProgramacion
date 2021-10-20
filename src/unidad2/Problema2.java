package unidad2;
import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura = 0;
        double base = 0;
        double area = 0;
        
        //Entrada
        System.out.println("Ingresa la base del triangulo: ");
        base = teclado.nextDouble();
        System.out.println("Ingresa la altura del triangulo: ");
        altura = teclado.nextDouble();
        
        //Proceso
        area = (base * altura)/2;
        
        //Salida
        System.out.println("El área del triangulo es = " + area);
        teclado.close();
    }
}
