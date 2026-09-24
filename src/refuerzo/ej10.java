package refuerzo;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int numero=0;
        System.out.println("Introduce un numero");
        numero= sc.nextInt();
        if (numero % 2 != 0 && numero % 3 != 0){
            System.out.println("No es multiplo de 2 ni  de 3 ");

        }else {
            System.out.println("Es multiplo de 2 o de 3");
        }
    }
}
