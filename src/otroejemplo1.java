import java.util.Scanner;

public class otroejemplo1 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
double peso;
double altura;

        System.out.println("Ingresa tu peso y altura ");

        peso = sc.nextDouble();
        altura = sc.nextDouble();
        double imc = peso / altura *altura;


        if (imc < 18.5){
            System.out.println("El peso esta bajo");
        }else if (imc  < 25 ) {
            System.out.println("El peso es normal");
        }else if (imc  < 30 ) {
        System.out.println("El peso es sobrepeso");
    }
        else{
            System.out.println("Se tiene obesidad");
        }


    }
}
