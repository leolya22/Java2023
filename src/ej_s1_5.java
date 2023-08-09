import java.util.Scanner;

public class ej_s1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio de la esfera");
        int radio = input.nextInt();
        double pi = Math.PI;
        double superficie = 4 * pi * radio * radio;
        double volumen = 4 * pi * radio * radio * radio / 3;
        System.out.println("La superficie de la esfera es igual a " + superficie);
        System.out.println("El volumen de la esfera es igual a " + volumen);
        input.close();
    }
}
