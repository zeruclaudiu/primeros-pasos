import java.util.Scanner;

public class Ejemplo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int numero;
int resultado;
        System.out.println("Introduce un numero");
        numero = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
          //  System.out.println(numero + " * " + i + " = " + resultado); ok
            System.out.printf("%d * %d = %d", numero, i, resultado);

        }
    }
}
