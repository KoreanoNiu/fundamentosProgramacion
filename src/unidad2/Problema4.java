package unidad2;
import java.util.Scanner;
import java.lang.Math;

public class Problema4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double radio = 0;
        double area = 0;
        final double PI = 3.14159265359;
        
        //Entrada
        System.out.println("Ingresa el radio del circulo ");
        radio = teclado.nextDouble();
        
        //Proceso con Math
        area = Math.PI * Math.pow(radio, 2);
        
        //Salida
        System.out.println("El área del circulo con Math.PI es = " + area);
        
        //Proceso con constante PI
        area = PI * (radio * radio);
        System.out.println("El área del circulo con constante PI es = " + area);
        teclado.close();
    }
}
