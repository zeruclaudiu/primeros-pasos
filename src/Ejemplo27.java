import java.util.Scanner;

public class Ejemplo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String resultado = "";
        numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            resultado = resultado + " " + i;
            System.out.println(resultado);
        }
    }
}
