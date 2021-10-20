package unidad2;
import java.util.Scanner;

public class Problema6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       double centimetros = 0;
       double pulgadas = 0;

        //Entrada
        System.out.println("Ingresa la medida en pulgadas(In): ");
        pulgadas = teclado.nextDouble();

        //Proceso
        centimetros = pulgadas * 2.54;

        //Salida
        System.out.println(pulgadas + " pulgadas son: " + centimetros + "cm");
       
        teclado.close();
    }
}
