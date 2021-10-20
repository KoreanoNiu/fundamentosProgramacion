package unidad2;
import java.util.Scanner;
import java.lang.Math;

public class Problema13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double catetoA = 0;
        double catetoO = 0;
        double hipotenusa = 0;

       System.out.println("Ingresa la medida del cateto adyacente: ");
       catetoA = teclado.nextDouble();

       System.out.println("Ingresa la medida del cateto opuesto: ");
       catetoO = teclado.nextDouble();

       hipotenusa = Math.sqrt((Math.pow(catetoA, 2) + Math.pow(catetoO, 2)));

       System.out.println("La hipotenusa del triangulo rectangulo es: " +hipotenusa);

       teclado.close();
    }
}
