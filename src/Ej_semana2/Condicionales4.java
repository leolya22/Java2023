package Ej_semana2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Condicionales4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int m = input.nextInt();
        System.out.print("Ingrese un numero mas: ");
        int n = input.nextInt();
        if (m % n == 0) System.out.println("El numero " + m + " es divisible por " + n);
        else System.out.println("Los números no se dividen sin resto");
        input.close();
        new FileReader("arch2.txt");
    }
}
