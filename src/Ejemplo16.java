import java.util.Scanner;

public class Ejemplo16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
int num1;
int num2;
        System.out.println("Ingresa los dos numeros");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
String operacion;



System.out.println("Introduce la operación a realizar (+, -, *, /):");
        operacion = sc.next();
        switch (operacion) {

            case "+":
                System.out.printf("El resultado de la suma es:" + (num1 + num2));
                break;
            case "-":
                System.out.printf("El resultado de la resta es:" + (num1 - num2));
                break;
            case "*":
                System.out.printf("El resultado de la multiplicacion es:" + (num1 * num2));
                break;
            case "/":
                System.out.printf("El resultado de la division es:" + (num1 / num2));
                break;

        }



    }
}
