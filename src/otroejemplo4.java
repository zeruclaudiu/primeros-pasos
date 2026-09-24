import java.util.Scanner;

public class otroejemplo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double importe;
        double descuento = 0;
        double importe_final;
        String socio;
        System.out.println("Ingrese el importe");
        importe = sc.nextDouble();
        System.out.println("¿Eres socio? (si/no)");
         socio = sc.next();
        if (socio.equals("si")) {
if ( importe > 100  ){
 descuento = 0.15;
} else if (importe >50) {
    descuento = 0.1;
}else{
    if (importe > 50){
        descuento = 0.05;
    }
}
importe_final = importe - (importe * descuento);
            System.out.println("El importe es: " + importe_final);


        }
    }
}