package unidad2;

public class ConstantesYVariables {
    public static void main (String[] args) {
        //Variable double puede cambiar su valor
        double precio = 25.75;
        System.out.println("El precio del producto es: " + precio);

        //La variable precio puede cambiar su valor
        precio = 30.15;
        System.out.println("El precio nuevo del producto es: " + precio);
        
        //Vamos a crear una constante
        final int MAYORIA_EDAD = 18;
        System.out.println("La edad para ser mayor de edad es: " + MAYORIA_EDAD);

        //No se puede modificar 
    }
}
