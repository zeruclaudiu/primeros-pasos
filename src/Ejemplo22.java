import java.util.Scanner;

public class Ejemplo22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        int numero = 0;
        System.out.println("Ecribe 10 numeros");

        for (int y = 0; y < 10; y++){ //para hacer el bucle hasta 10
             numero = sc.nextInt();
            System.out.println("Escribe otro numero");
            if (numero >= 0){  //si el numero es mayor k 0 es positivo y se suma 1 a positivos
                positivos = positivos + 1;
            }
        }
        System.out.println("Son positivos: " + positivos + "numeros") ;
    }
}
