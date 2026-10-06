import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoinicial;
        System.out.println("Ingrese la cantidad de dinero que tienes");
        saldoinicial = sc.nextDouble();
        String opcion;
    do {
        System.out.println("1.Ingresar" + " 2.Retirar" + " 0.Salir");
        opcion = sc.next();
        if (opcion.equals("1")) {
            System.out.println("Cantidad a ingresar: ");
            double cantidad = sc.nextDouble();
            saldoinicial = cantidad + saldoinicial;
            System.out.println("Saldo restante: " + saldoinicial);
        } else if (opcion.equals("2")) {
            System.out.println("Cantidad a retirar: ");
            double cantidad = sc.nextDouble();
            if (cantidad <= saldoinicial) {
                saldoinicial = saldoinicial - cantidad;
                System.out.println("Saldo restante: " + saldoinicial);
            } else {
                System.out.println("No tienes suficiente dinero ");
            }
        }
    }while ( !opcion.equals("0"));
    }
}
