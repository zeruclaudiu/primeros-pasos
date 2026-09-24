package refuerzo;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int a=0;
int b=0;
        System.out.println("Ponga el primer numero");
        a= sc.nextInt();
        if (a == 0 ){
            System.out.println("El producto de 0 por cualquier numero es 0");
        }else {
            System.out.println("Ponga el segundo numero");
            b= sc.nextInt();
            System.out.println("El resultado de la multiplicacion es " + (a * b));
        }
    }
}
