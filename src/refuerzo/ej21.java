package refuerzo;

import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double grosorpapel;
        double alturaedificio;
        double dobleces=0;
        System.out.println("Ingrese el valor del grosor de papel y la altura del eficio");
        grosorpapel=sc.nextDouble();
        alturaedificio=sc.nextDouble();
        grosorpapel=grosorpapel*0.000001;
       while (grosorpapel<=alturaedificio){
           grosorpapel=grosorpapel*2;
           dobleces++;

       }
        System.out.println("El papel se ha doblado " + dobleces + " veces");
    }
}
