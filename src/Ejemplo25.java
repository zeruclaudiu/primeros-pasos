import java.util.Scanner;

public class Ejemplo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        long suma = 1;
        System.out.println("Introduce un numero ");
        numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            suma = suma * i;
        }
        System.out.println("El factorial es: " + suma);
    }
}
