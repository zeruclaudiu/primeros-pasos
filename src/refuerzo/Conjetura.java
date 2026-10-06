package refuerzo;

import java.util.Scanner;

public class Conjetura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero natural ");
        int n = sc.nextInt();
        int contador = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                contador++;
            } else {
                n = n * 3 + 1;
                contador++;
            }
        }
        System.out.println("El total de iteraciones son " +contador);
    }
}