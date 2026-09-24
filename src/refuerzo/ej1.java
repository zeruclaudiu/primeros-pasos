package refuerzo;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numero = 0;
        System.out.println("Introduce un numero");

        numero = sc.nextInt();
        System.out.println("El doble es " + (numero*2)+ ". " + "El triple es " + (numero*3));

    }
}
