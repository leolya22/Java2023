import java.util.Scanner;

public class ej_s1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo");
        int base = input.nextInt();
        System.out.println("Ingrese la altura del rectángulo");
        int altura = input.nextInt();
        int perimetro = 2 * (base + altura);
        int area = base * altura;
        System.out.println("El perimetro es igual a " + perimetro);
        System.out.println("El area es igual a " + area);
        input.close();
    }
}
