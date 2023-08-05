import java.util.Scanner;

public class ej_s1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero1 = input.nextInt();
        System.out.println("Ingrese un numero mas");
        int numero2 = input.nextInt();
        while (numero2 == 0) {
            System.out.println("Ingrese un numero que no sea 0");
            numero2 = input.nextInt();
        }
        System.out.println(numero1 + numero2);
        System.out.println(numero1 - numero2);
        System.out.println(numero1 * numero2);
        System.out.println(numero1 / numero2);
        System.out.println((double) numero1 / (double) numero2);
        System.out.println(numero1 % numero2);
        input.close();
    }
}
