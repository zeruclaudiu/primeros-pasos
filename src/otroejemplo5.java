import java.util.Scanner;

public class otroejemplo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;
        System.out.println("Introduce la nota");
        nota = sc.nextDouble();
        System.out.println("Has entregado todas las practicas? si/no");
        String practicas;
        practicas = sc.next();

        if (practicas.equals("si")) {
            if (nota < 5) {
                System.out.println("Suspenso");
            } else if (nota < 6.9) {
                System.out.println("Aprobado");
            } else if (nota < 8.9) {
                System.out.println("Notable");

            } else {
                System.out.println("Sobresaliente");
            }
        }else {
                if (nota < 5) {
                    System.out.println("Suspenso de nota y practicas");
                } else {
                    System.out.println("Suspenso por practicas pendientes");
                }
            }


        }
    }

