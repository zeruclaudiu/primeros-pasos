package refuerzo;

import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce distancia(metros), velocidadmaxima(km/h) y segundos");
        double metros=sc.nextDouble();
        double velocidadmaxima=sc.nextDouble();

        double segundos=sc.nextDouble();
        double velocidad=metros/segundos;
         velocidad=velocidad * 3.6;
        if (velocidad <= velocidadmaxima){
            System.out.println("La velocidad es ok: "+ velocidad);

        } else if (velocidad<(1.2*velocidadmaxima)) {
            System.out.println("La velocidad no es ok: "+ velocidad + " multa ");

        }else  {
            System.out.println("La velocidad no es ok: "+ velocidad + " multa + puntos");
        }

    }
}
