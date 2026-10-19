import java.util.Scanner;

public class practi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pon dos numeros");
int n1=sc.nextInt();
int n2=sc.nextInt();
        System.out.println("Introduce la operación a realizar (+, -, *, /):");
 String operacion = sc.next();
 switch(operacion){
     case "+":
         System.out.println("la suma es " + n1+n2);
         break;
         case "-":
             System.out.println("la resta es " + n1+n2);
             break;
             case "*":
                 System.out.println("la multiplicacion es " + n1*n2);
                 break;
                 case "/":
                     System.out.println("la division es " + n1/n2);
                     break;

 }
        }
    }

