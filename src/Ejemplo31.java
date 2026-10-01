import java.util.Scanner;

public class Ejemplo31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        String resultado = "";
        System.out.println("Ingresa un numero");
        for (int i = 1; i <= numero; i++) {
            if(numero % i == 0){
                resultado = resultado + " " + i;
            }

        }
        System.out.println("Los numeros divisores de " + numero + " son " + resultado);

    }
}
