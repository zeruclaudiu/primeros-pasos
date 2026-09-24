package refuerzo;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=0;
        System.out.println("Indica dos numeros");
        a= sc.nextInt();
        b= sc.nextInt();
        if (b == 0){
            System.out.println("Error: no se puede dividir entre 0");

        }else {
            System.out.println("El resultado de la division es " + (a / b));
        }
    }
}
