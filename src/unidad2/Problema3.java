package unidad2;
import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura = 0;
        double baseMenor = 0;
        double baseMayor = 0;
        double area = 0;
        
        //Entrada
        System.out.println("Ingresa la base menor del trapecio ");
        baseMenor = teclado.nextDouble();
        System.out.println("Ingresa la base mayor del trapecio ");
        baseMayor = teclado.nextDouble();
        System.out.println("Ingresa la altura del trapecio: ");
        altura = teclado.nextDouble();
        
        //Proceso
        area = ((baseMayor + baseMenor)/2) * altura;
        
        //Salida
        System.out.println("El área del trapecio es = " + area);
        teclado.close();
    }
}
