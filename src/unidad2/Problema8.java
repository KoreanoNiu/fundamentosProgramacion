package unidad2;
import java.util.Scanner;

public class Problema8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       double horasTrabajadas = 0;
       double precioHora = 0;
       double sueldoBruto = 0;
       double fondoAhorro = 0;
       double seguroVida = 0;
       double sueldoNeto = 0;

        //Entrada
        System.out.println("¿Cuántas horas trabajo el trabajador?");
        horasTrabajadas = teclado.nextDouble();

        System.out.println("¿Cuál es el sueldo por hora?");
        precioHora = teclado.nextDouble();

       //Proceso
        sueldoBruto = horasTrabajadas * precioHora;
        seguroVida = sueldoBruto * 0.03;
        fondoAhorro = sueldoBruto * 0.02;
        sueldoNeto = sueldoBruto - (seguroVida + fondoAhorro);

       //Salida
       System.out.println("Sueldo bruto:  \t\t" + "$" +sueldoBruto);
       System.out.println("Seguro de vida:  \t" + "$" +seguroVida);
       System.out.println("Fondo de ahorro:  \t" + "$" + fondoAhorro);
       System.out.println("──────────────────────────────");
       System.out.println("Sueldo neto:  \t\t" + "$" + sueldoNeto);
       
       teclado.close();
    }
}
