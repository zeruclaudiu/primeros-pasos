import java.util.Scanner;

public class Ejemplo9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


int edad;
        System.out.println("Ingresa la edad");
        edad = sc.nextInt();

        if (edad >= 18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}
