import java.util.Scanner;

public class ej_s1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = input.nextInt();
        System.out.println("Número ingresado = " + numero);
        input.close();
    }
}
