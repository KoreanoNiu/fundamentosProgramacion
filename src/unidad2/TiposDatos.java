package unidad2;

public class TiposDatos {
    /*
    int->enteros
    float-> numeros con punto
    char -> 1 caracter
    boolean -> verdadero - false
    */
    //Las variables se escriben en minúsculas
    //separando la segunda palabara con mayúsculas
    int edad = 17;
    int numeroAlumnos = 12;
    int escuelasEnMexico = 12991;

    //byte
    //short
    //int
    //long

    //decimal
    double temperatura = 15.4;
    double saldoTarjeta = 250.25;

    
    //Una sola letra
    char letra = 'A';
    char grupo = 'B';

    //boolean/decisiones
    boolean mayorDeEdad = false;
    boolean resultado = true;
    public static void main(String[] args) {
        char letra = 'A';
        long numeroBacterias = 21231231241241L;

        byte numero = 0;
        int otroNumero = 200;
        numero = (byte)otroNumero;

        System.out.println("El valor es" + letra);
        System.out.println("El numero de bacterias es:  " + numeroBacterias);
        System.out.println("El numero es: " + numero    );

        
    }
}