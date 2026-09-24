package refuerzo;

import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int i;
        System.out.println("Escribe un numero: ");
        numero = sc.nextInt();
        if (numero % 2 != 0) {
            numero++;

        }
        for (i = 0; i < 5 ; i++) {
            System.out.println(numero);
            numero += 2;
        }
    }
}
