package refuerzo;

import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        double mayor;
        System.out.println("Introduce 3 numeros");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();

        mayor = num1;
        if (num2 > mayor){
            mayor = num2;
        }
        if (num3 > mayor){
             mayor = num3;
}
        System.out.println("El número mayor es: " + mayor);

    }
}
