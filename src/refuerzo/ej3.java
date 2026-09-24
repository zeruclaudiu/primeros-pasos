package refuerzo;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=0;
        System.out.println("Diga dos numeros");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a % b == 0){
            System.out.println("El primero es multiplo del segundo");

        }else {
            System.out.println("El primero no es multiplo del segundo");
        }
    }
}
