package class4;

import java.util.Scanner;

public class class4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero mayor de 0: ");
        int numero = input.nextInt();
        while (numero <= 0) {
            System.out.print("Ingrese un numero mayor de 0: ");
            numero = input.nextInt();
        }
        int fact = 1;
        StringBuilder operacion = new StringBuilder("1");
        for (int i = 2; i <= numero; ++i) {
            fact *= i;
            operacion.append(" * ").append(i);
        }
        System.out.println(numero + "! = " + operacion + " = " + fact);
        input.close();
    }
}
