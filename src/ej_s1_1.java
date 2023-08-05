import java.util.Scanner;

public class ej_s1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = input.nextLine();
        System.out.println("Hola " + nombre + "! Como estas?");
        input.close();
    }
}
