import java.util.Scanner;

public class ej_s1_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero A");
        int a = input.nextInt();
        System.out.println("Ingrese el numero B");
        int b = input.nextInt();
        System.out.println("A :" + a);
        System.out.println("B :" + b);
        System.out.println("************MAGIC************");
        int c = a;
        a = b;
        b = c;
        System.out.println("A :" + a);
        System.out.println("B :" + b);
        input.close();
    }
}
