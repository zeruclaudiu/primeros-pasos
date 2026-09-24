package refuerzo;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a=0;
        System.out.println("Introduce un numero");
        a= sc.nextInt();
        if (a % 2 == 0){
            System.out.println("Es multiplo de 2");

        }else if (a % 3 ==0){
            System.out.println("Es multiplo de 3");
        }else {
            System.out.println("No es multiplo de ninguno");
        }
    }
}
