import java.util.Scanner;
public class Ejemplo5 {
    public static void main (String argv[]) {
        float primer_numero ;
        float segundo_numero;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");
        primer_numero = inputValue.nextFloat();

        System.out.println("Introduce el segundo numero:");
        segundo_numero = inputValue.nextFloat();
        float sum = primer_numero + segundo_numero;
        float sub = primer_numero - segundo_numero;
        float mult = primer_numero * segundo_numero;
        float div = primer_numero / segundo_numero;

        System.out.println( "La suma de los dos es " + sum);
        System.out.println( "La resta de los dos es " + sub);
        System.out.println( "La multiplicacion de los dos es " + mult);
        System.out.println( "La division de los dos es " + div);


    }
}

