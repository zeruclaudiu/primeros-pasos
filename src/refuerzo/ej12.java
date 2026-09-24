package refuerzo;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=0;
        System.out.println("Introduce dos numeros");
        a= sc.nextInt();
        b= sc.nextInt();

        if (a % 2 == 0 || b % 2 == 0){
            System.out.println("Almenos 1 numero es par");

        }else {
            System.out.println("Ninguno es par");
        }
    }
}
