package unidad2;

public class OperadorIncremento {
    public static void main(String[] args) {
        int var = 10;
        var = var + 1;
        System.out.println("Var = " + var);

        var += 1;
        System.out.println("Var = " + var);

        var++;
        System.out.println("Var = " + var);
        //Var = 13

        int suma = 0;
        suma = var++;
        System.out.println("Suma = " + suma);
        System.out.println("Var = " + var);

        suma = 0;
        suma = ++var;
        System.out.println("Suma = " + suma);
        System.out.println("Var = " + var);
    }
}
