import java.util.Scanner;

public class Ejemplo18 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int horas;
        int minutos;
        int segundos;

        System.out.println("Ingresa el numero de horas");
        horas = sc.nextInt();
        System.out.println("Ingresa el numero de minutos");
        minutos = sc.nextInt();
        System.out.println("Ingresa el numero de segundos");
        segundos = sc.nextInt();
            segundos++;

            if (segundos == 60 ){
                segundos = 0;
                minutos = minutos + 1;
                  if (minutos == 60){
                      minutos =0;
                      horas = horas + 1;
                  }
            }
        System.out.println("H" + horas +" "+ "M" + minutos+" " + "S" + segundos);




    }
}
