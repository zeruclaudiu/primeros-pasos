package refuerzo;

import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t;
        int horas;
        int minutos;
        int segundos;

        System.out.println("Introduce el tiempo en segundos: ");
        t = sc.nextInt();
        horas = t / 3600;
        minutos = (t % 3600) / 60;
        segundos = t % 60;
        System.out.println(horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
    }
}
