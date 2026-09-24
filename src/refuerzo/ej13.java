package refuerzo;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Introduce el primer número entero: ");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo número entero: ");
        num2 = sc.nextInt();

        // Comprobamos si num1 es par y num2 es impar, O si num1 es impar y num2 es par
        boolean esPar1 = (num1 % 2 == 0);
        boolean esPar2 = (num2 % 2 == 0);

        if (esPar1 ^ esPar2) { // El operador ^ es el OR exclusivo (XOR)
            System.out.println("Uno y sólo uno de los números es par.");
        } else {
            System.out.println("No se cumple que uno y sólo uno sea par (ambos son pares o ambos son impares).");
        }
    }
}