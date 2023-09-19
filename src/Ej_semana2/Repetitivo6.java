package Ej_semana2;

import java.util.Scanner;

public class Repetitivo6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int a = input.nextInt();
        System.out.print("Ingrese otro numero: ");
        int b = input.nextInt();
        int multiplicacion = 0;
        for (int i = 0; i < b; i++) {
            multiplicacion += a;
        }
        System.out.println("La multiplicación de " + a + " y " + b + " es igual a " + multiplicacion);
        input.close();
    }
}
