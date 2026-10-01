import java.util.Scanner;

public class Ejemplo35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;

        System.out.println("Ingrese el numero a dividir");
        int numero2;
        System.out.println("Ingrese el numero por el que se debe dividir");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        int total =0;


       do {

           numero1 = numero1 - numero2;
           total ++;

       }while (numero1 >= numero2);

        System.out.println("El numero es: " + total);
    }



}
