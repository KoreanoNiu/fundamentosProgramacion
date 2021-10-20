package unidad2;
import java.util.Scanner;
        
public class ActividadLectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        byte edad = 0;
        System.out.println("¿Cuántos años tienes?");
        edad = teclado.nextByte();
        System.out.println("Su edad es: " + edad);

        byte manzanas = 0;
        System.out.println("Ingresa cuántas manzanas quieres vender");
        manzanas = teclado.nextByte();
        System.out.println("Usted vendera " + manzanas + " manzanas");

        short librosLeidos = 0;
        System.out.println("Cuántos libros has leido en este año:");
        librosLeidos = teclado.nextShort();
        System.out.println("Has leido: " + librosLeidos);

        short calificacion1 = 0;
        System.out.println("Ingresa tu primer calificacion:");
        calificacion1 = teclado.nextShort();
        System.out.println("Tu primer calificacion es: " + calificacion1);

        int codigoPostal = 0;
        System.out.println("Ingresa tu codigo postal: ");
        codigoPostal = teclado.nextInt();
        System.out.println("Su codigo postal es:" + codigoPostal);

        int cantidadTenis = 0;
        System.out.println("Cuántos pares de tenis tienes?");
        cantidadTenis = teclado.nextInt();
        System.out.println("Tienes " + cantidadTenis + " pares de tenis");

        long materias = 0L;
        System.out.println("Cuántas materias llevas en el semestre: " + materias);
        materias = teclado.nextLong();
        System.out.println("Tu llevas " + materias + " en el semestre"); 

        long semestre = 0L;
        System.out.println("Ingresa tu semestre en curso");
        semestre = teclado.nextLong();
        System.out.println("Tu semestre actual es: " + semestre);

        double precioComputadora = 0;
        System.out.println("Ingresa cuanto cuesta la computadora ultimo modelo: ");
        precioComputadora = teclado.nextDouble();
        System.out.println("Tu saldo disponible es: " + precioComputadora);

        double temperaturaCorporal = 0;
        System.out.println("Ingresa cual es tu temperatura corporal");
        temperaturaCorporal = teclado.nextDouble();
        System.out.println("Tu temperatura corporal es: " + temperaturaCorporal);

        float aguaConsumida = 0F;
        System.out.println("Ingresa cuantos litros de agua bebiste en el dia:");
        aguaConsumida = teclado.nextFloat();
        System.out.println("Tu consumiste" + aguaConsumida + " litros en el dia");

        float distanciaRecorrida = 0F;
        System.out.println("Ingresa cuantos kilometros recorriste en la carrera");
        distanciaRecorrida = teclado.nextFloat();
        System.out.println("Tu recorriste " + distanciaRecorrida + "km");

        teclado.close();
    }
}
