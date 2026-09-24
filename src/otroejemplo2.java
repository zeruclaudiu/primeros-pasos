import java.util.Scanner;

public class otroejemplo2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
double consumo;
        System.out.println("Introduce el consumo ");
        consumo = sc.nextDouble();
double precio;


        if (consumo <= 100){
            precio = consumo * 0.10;

        } else if ( consumo<= 300){

            precio = (100 * 0.10) +  ((consumo - 100) * 0.15);


        }else{
            precio = (100 * 0.10) + (200 * 0.15) + ((consumo - 300) * 0.20);
        }

        System.out.println("El total a pagar es " + precio);


    }


    }


