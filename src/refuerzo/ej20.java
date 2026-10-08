package refuerzo;

import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el saldo de mi cuenta y los gastos ");
        double saldo=sc.nextDouble();
        double gasto=sc.nextDouble();
        double total=saldo+gasto;
        if (total<=0){
            System.out.println("No llega a fin de mes " + total);

        }else if (total>0){
            System.out.println("Si llega a fin de mes " + total);
        }
    }
}
