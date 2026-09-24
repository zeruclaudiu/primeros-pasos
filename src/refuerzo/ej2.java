package refuerzo;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        int numero =0;
        System.out.println("Diga un numero");
        numero = sc.nextInt();
        if (numero % 2 == 0){
            System.out.println("El numero es par");

        }else {
            System.out.println("El numero no es par");
        }
    }
}
