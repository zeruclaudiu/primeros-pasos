import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor;
        System.out.println("Ingresa el valor");
        valor = sc.nextInt();

        if (valor >= 0){
            System.out.println("El valor es positivo");
        }else{
            System.out.println("El valor es negativo");
        }
    }
}
