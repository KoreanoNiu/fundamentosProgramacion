package unidad2;

public class EjercicioEval1 {
    public static void main(String[] args) {
        System.out.println("C O N S T A N T E S");
        //Constantes con byte
        System.out.println("──────BYTE──────");
        final byte DIAS_SEMANA = 7;
        System.out.println("La semana tiene " + DIAS_SEMANA + " días");

        final byte MESES_ANHO = 12;
        System.out.println("Un año tiene " + MESES_ANHO + " meses");

        //Constantes con short
        System.out.println("\n──────SHORT──────");
        final short VELOCIDAD_COCHE = 230;
        System.out.println("Un coche viaja a una velocidad constante de: " + VELOCIDAD_COCHE + " km/hr");

        final short MINUTOS = 60;
        System.out.println("Una hora tiene " + MINUTOS + " minutos");

        //Constantes con int
        System.out.println("\n──────INT──────");
        final int VELOCIDAD_LUZ = 300000;
        System.out.println("La velocidad de la luz en el vacío es constante a: " + VELOCIDAD_LUZ + " m/s");

        final int HORAS = 24;
        System.out.println("El día tiene: " + HORAS +" horas");

        //Constantes con long
        System.out.println("\n──────LONG──────");
        final long COMBINACIONES_POSIBLES_2X2 = 3674160L;
        System.out.println("El Cubo de Rubik 2x2x2 tiene " + COMBINACIONES_POSIBLES_2X2 + " combinaciones diferentes posibles");

        final long COMBINACIONES_POSIBLES_3X3 = 4325200327448985609L;
        System.out.println("El Cubo de Rubik 3x3x3 tiene " + COMBINACIONES_POSIBLES_3X3 + " combinaciones diferentes posibles");

        //Constantes con double
        System.out.println("\n──────DOUBLE──────");
        final double PI = 3.14159265359;
        System.out.println("El valor del número PI es: " + PI);

        final double GRAVEDAD_TIERRA = 9.807;
        System.out.println("La gravedad en el planeta tierra es: " + GRAVEDAD_TIERRA);

        //Constantes con float
        System.out.println("\n──────FLOAT──────");
        final float E = 2.718281F;
        System.out.println("El número constante de Euler tiene un valor de: " + E);

        final float CERO_ABSOLUTO = -273.15F;
        System.out.println("La temperatura del cero absoluto es:  " + CERO_ABSOLUTO);

        //Constantes con char
        System.out.println("\n──────CHAR──────");
        final char LETRA_A = 'A';
        System.out.println("La primer letra del abcedario es: " + LETRA_A);

        final char NO = 'N';
        System.out.println("\"Escriba " + NO +" para indicar que NO quiere continuar \" ");

        //Constantes con boolean
        System.out.println("\n──────BOOLEAN──────");
        final boolean SATELITE_NATURAL = true;
        System.out.println("La luna es el satelite natural de la tierra: " + SATELITE_NATURAL);

        final boolean MAYORIA_EDAD = true;
        System.out.println("Eres mayor de edad, puedes consumir bebidas alcoholicas: " + MAYORIA_EDAD);

        System.out.println("\nV A R I A B L E S");
        System.out.println("──────BYTE──────");

        //Variables con byte
        byte numeroTeclas = 64;
        System.out.println("Mi teclado tiene " + numeroTeclas + " teclas");

        byte librosLeidos = 5;
        System.out.println("Este año he leido " + librosLeidos + " libros");

        //Variables con short
        System.out.println("\n──────SHORT──────");
        short tiempoRestante = 237;
        System.out.println("Te quedan " + tiempoRestante + " minutos para entregar el examen");

        short casasVendidas = 5421;
        System.out.println("El día de hoy una constructora vendió: " + casasVendidas + " casas");

        //Variables con int
        System.out.println("\n──────INT──────");
        int gananciaDiaria = 2154122;
        System.out.println("El día de hoy una empresa de abarrotes obtuvo una ganancia de: " + gananciaDiaria + " pesos");

        int zapatosDisponibles = 14121;
        System.out.println("Fui a una zapateria y tenían un almacen de: " + zapatosDisponibles + " zapatos para vender y a la espera de más modelos");

        //Variables con long
        System.out.println("\n──────LONG──────");
        long productosVendidos = 211251235152L;
        System.out.println("Amazon vendió: " + productosVendidos + " productos en 2021");

        long aguaDisponible = 105600L;
        System.out.println("Una cistenera tiene: " + aguaDisponible + " litros disponibles para su uso");

        //Variables con double
        System.out.println("\n──────DOUBLE──────");
        double saldoDisponible = 1221.24;
        System.out.println("Mi saldo disponible en el banco es: " + saldoDisponible);

        double temperatura = 28.6;
        System.out.println("La temperatura media del día de hoy fue de: " + temperatura + " °");

        //Variables con float
        System.out.println("\n──────FLOAT──────");
        float pesoPersona = 65.6F;
        System.out.println("Una persona pesa  " + pesoPersona + " kg");

        float distanciaCorrida = 12.25F;
        System.out.println("Un corredor profesional corrió " + distanciaCorrida + " km en un maraton" );

        //Variables con char
        System.out.println("\n──────CHAR──────");
        char opcion = 'A';
        System.out.println("La respuesta de la pregunta 1 era la opción: " + opcion);

        char inicialNombre = 'C';
        System.out.println("La inicial de mi nombre es: " + inicialNombre);

        //Variables boolean
        System.out.println("\n──────BOOLEAN──────");
        byte numero1 = 3;
        byte numero2 = 1;
        boolean esMayor  = ( numero1 > numero2)?true:false;
        System.out.println("El numero1" + "(" + numero1 +") " + "es mayor que el numero2" + "(" + numero2 + "): " + esMayor);

        boolean enviarFormulario = false;
        System.out.println("Enviar el formulario y sus respuestas: " + enviarFormulario);
    }
}
