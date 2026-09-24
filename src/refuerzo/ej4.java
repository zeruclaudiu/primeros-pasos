package refuerzo;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int otronumero =0;
        int numero =0;
        System.out.println("Di un numero");
        numero= sc.nextInt();
        if (numero % 10 == 0) {
            System.out.println("Si es multiplo de 10, vuelve a poner otro numero");

            otronumero= sc.nextInt();
            if (otronumero % 10 ==0){
                System.out.println("Tambien es multiplo de 10");
            }else {
                System.out.println("No es multiplo de 10");
            }



        }else {
                System.out.println("No es multiplo de 10");
            }

        }
    }

