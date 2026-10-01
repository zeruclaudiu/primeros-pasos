import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoinicial;
        System.out.println("Ingrese la cantidad de dinero que tienes");
        saldoinicial = sc.nextDouble();
        System.out.println("1.Ingresar" + " 2.Retirar" + " 0.Salir");
        String opcion = sc.next();

    }
}
