package refuerzo;

import java.util.Scanner;

public class Ejemplo34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int total =0;
        System.out.println("Ingrese el numero a multiplicar");
        int numero2;
        System.out.println("Ingrese el numero por el que se debe multiplicar");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();

        for (int i = 1; i <= numero2; i++) {
            total = total + numero1;


        }
        System.out.println("El numero es: " + total);
    }

}
