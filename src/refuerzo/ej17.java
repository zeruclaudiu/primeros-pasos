package refuerzo;

import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
int num1;
int num2;
        System.out.println("Di dos numeros enteros");
        num1=sc.nextInt();
        num2=sc.nextInt();
        if(num1 == num2){
            System.out.println("Numeros iguales");

        }
        if (num1 > num2){
            System.out.println("Primer numero es mayor que el segundo numero");
        }
        if (num1 < num2){
            System.out.println("Segundo numero es mayor que el primer numero");
        }
    }
}
