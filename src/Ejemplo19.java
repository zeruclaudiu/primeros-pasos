import java.util.Scanner;

public class Ejemplo19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
int horas;
double preciohora;
double salariobruto;
double salarioneto;
double impuestos;
        System.out.println("Introduce las horas y el precio ");
horas = sc.nextInt();
preciohora = sc.nextDouble();

if (horas <= 35){
    salariobruto = preciohora * horas;

} else {
    salariobruto = preciohora * 35;
salariobruto = salariobruto + (horas - 35) * preciohora * 1.5;

}

 if (salariobruto <= 500){
     impuestos = 0;


 }else if (salariobruto  <= 900 ) {
     impuestos = (salariobruto - 500 )  * 0.25;

 }else{
     impuestos = (400 * 0.25) + (salariobruto - 900)* 0.45;

 }

        System.out.println("El sueldo bruto es " + salariobruto);

        System.out.println("El sueldo neto es " + (salariobruto - impuestos));

        System.out.println("Los impuestos son " + impuestos);

}







    }

