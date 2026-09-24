import java.util.Scanner;

public class Ejemplo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor1;
        double valor2;
        System.out.println("Ingresa el valor1");
        valor1 = sc.nextDouble();

        System.out.println("Ingresa el valor2");
        valor2 = sc.nextDouble();

        if (valor1 > valor2){
            System.out.println("El orden es " + valor2 + " - " + valor1);

        }else{
            System.out.println("El orden es " + valor1 + " - " + valor2);
        }
    }
}
