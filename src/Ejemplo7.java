import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio_real;
        System.out.println("Ingrese el precio real");
        precio_real = sc.nextDouble();

        double precio_rebajado;
        System.out.println("Ingrese el precio rebajado");
        precio_rebajado = sc.nextDouble();
        double descuento = (precio_real - precio_rebajado ) / precio_real * 100;
        System.out.println("El descuento es " + descuento + "%");

    }
}
