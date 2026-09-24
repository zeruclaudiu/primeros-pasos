package refuerzo;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        System.out.println("Introduce un numero");
        a= sc.nextInt();
        if (a % 2 == 0 && a % 3 == 0){
            System.out.println("Es multiplo de 2 y 3 simultaneamente");

        }else {
            System.out.println("No es multiplo de 2 y 3 simultaneamente");
        }
    }
}
