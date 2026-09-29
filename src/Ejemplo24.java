import java.util.Scanner;

public class Ejemplo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notas;
        double media = 0;
        double totalnotas = 0;
        double sumanotas = 0;

        System.out.println("Introduce las notas (-1 para acabar)");
        do {
            notas = sc.nextDouble();
            if (notas >= 0) {
                totalnotas++;
                //     sumanotas = sumanotas + notas;
                media = (media + notas) / totalnotas;
                if (notas == 10) {
                    System.out.println("Hay una nota 10");

                }
            }

        }while (notas != -1);


            // media = sumanotas /totalnotas;
            System.out.println("La nota media es: " + media);
            // if (notas == 10) {
            //   System.out.println("Hay una nota 10");
            // } else {
            //    System.out.println("No hay ningun 10");



    }
}
