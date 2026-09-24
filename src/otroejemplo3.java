import java.util.Scanner;

public class otroejemplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado1;
        double lado2;
        double lado3;
        System.out.println("Introduce los 3 lados");
        lado1 = sc.nextDouble();
        lado2 = sc.nextDouble();
        lado3 = sc.nextDouble();

        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado3 + lado2 > lado1)) {
            if (lado1 == lado2 && lado2 == lado3) {

                System.out.println("Triangulo equilatero");

            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triangulo isosceles");
            } else {
                System.out.println("Triangulo Escaleno");
            }


        }
    }
}