package refuerzo;

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Introduce el primer numero entero");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero entero");
        num2 = sc.nextInt();
        if (num1 > 0 && num2 > 0){
            System.out.println("Los dos numeros son positivos");

        } else if (num1 > 0 || num2 > 0) {
            System.out.println("Uno de los numeros es positivo");


        }else {
            System.out.println("Ninguno de los numeros es positivo");
        }
    }
}
