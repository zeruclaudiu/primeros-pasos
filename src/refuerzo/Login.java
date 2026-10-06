package refuerzo;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contraseña= 1234;
        int max_intentos= 3;
        int intentos= 0;
        int mostrador=3;
        while(intentos < max_intentos){
            System.out.println("Introduce la contraseña de 4 numeros: ");
            int numero = sc.nextInt();
            if(numero == contraseña){
                System.out.println("Acceso concedido: ");
                break;
            }else {
                intentos ++;
                mostrador--;
                System.out.println("Contraseña incorrecta, te quedan  " + mostrador + " intentos ");
            }
            if (intentos == max_intentos){
                System.out.println("Cuenta bloqueada: ");
            }
        }

    }
}
