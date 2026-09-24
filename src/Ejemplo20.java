import java.util.Scanner;

public class Ejemplo20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double precio;

        System.out.println("Ingresa el precio");

        precio = sc.nextInt();

        if (precio < 6 ) {
            precio = precio;

        }else if (precio >= 6 && precio < 60) {
            precio = precio - (precio * 0.05);

        }else{
                    precio = precio - (precio * 0.1);

            }
        System.out.println("El valor total es " + precio);



    }
}
