import java.util.Scanner;

public class Ejemplo22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        System.out.println("Ecribe 10 numeros");

        for (int y = 0; y < 10; y++){
            int num = sc.nextInt();
            System.out.println("Escribe otro numero");
            if (num > 0){
                positivos++;
            }
        }
        System.out.println("Son positivos: " + positivos);
    }
}
