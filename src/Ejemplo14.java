import java.util.Scanner;

public class Ejemplo14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor1;
        System.out.println("Ingresa el valor1");
        valor1 = sc.nextInt();

        if (valor1 < 3 ){
            System.out.println("El numero es muy deficiente " + valor1);
        } else if (valor1 < 5) {
            System.out.println("El numero es insuficiente " + valor1);
        }else if (valor1 < 6) {
            System.out.println("El numero es suficiente " + valor1);
        }else if (valor1 < 7) {
            System.out.println("El numero es bien " + valor1);
        }else if (valor1 < 9) {
            System.out.println("El numero es notable " + valor1);
        }
        else {
            System.out.println("El numero es sobresaliente" + valor1);
        }
    }
}
