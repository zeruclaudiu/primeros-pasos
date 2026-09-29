import java.util.Scanner;

public class Ejemplo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int positivo =0;
        System.out.println("Introduce numeros (0 para acabar)");
        do {
             num = sc.nextInt();
            if (num > 0) {
                positivo = positivo + 1;
            }
        }while (num != 0);
        System.out.println("Son positivos: " + positivo + " numeros") ;

    }
}
