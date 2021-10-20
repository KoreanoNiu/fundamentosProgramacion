package unidad2;
import java.util.Scanner;

public class Problema12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroAlumnos = 0;
        double costoInscripcion = 0;
        double ingreso = 0;

        System.out.println("Ingresa la cantidad de alumnos en el grupo: ");
        numeroAlumnos = teclado.nextInt();
        
        System.out.println("Cuál es el costo de la inscripcion: ");
        costoInscripcion = teclado.nextDouble();

        ingreso = numeroAlumnos * costoInscripcion;

        System.out.println("En el grupo hay \t\t" + numeroAlumnos + " alumnos" );
        System.out.println("La inscripcion cuesta: \t\t$" + costoInscripcion);
        System.out.println("──────────────────────────────────────────");
        System.out.println("El ingreso del semestre es: \t$" + ingreso);

       teclado.close();
    }
}
