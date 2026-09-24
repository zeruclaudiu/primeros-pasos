import java.util.Scanner;

public class Ejemplo6 {
    public static void main(String[] args) {

double radio ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio: " );
radio = sc.nextInt();
double perimetro = 2 * Math.PI * radio;
double area = Math.PI * radio * radio;

System.out.println( "El perimetro del radio es " + perimetro );
System.out.println( "El area es del radio es " + area);


    }
}
