package Ej_semana2;

import java.util.Scanner;

public class Repetitivo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantidad = 0;
        while (cantidad <= 0) {
            System.out.print("Ingrese un numero mayor que 0: ");
            cantidad = input.nextInt();
        }
        System.out.print("Ingrese un numero entero: ");
        int aux = input.nextInt();
        int maximo = aux;
        int minimo = aux;
        int repeticionMax = 1;
        int repeticionMin = 1;
        String vezMax = " vez";
        String vezMin = " vez";
        for (int i = 1; i < cantidad; i++) {
            System.out.print("Ingrese un numero entero: ");
            aux = input.nextInt();
            if (aux > maximo) {
                maximo = aux;
                repeticionMax = 1;
                vezMax = " vez";
            } else if (aux < minimo) {
                minimo = aux;
                vezMin = " vez";
                repeticionMin = 1;
            } else if (aux == maximo) {
                repeticionMax++;
                vezMax = " veces";
            } else if (aux == minimo) {
                repeticionMin++;
                vezMin = " veces";
            }
        }
        System.out.println("\nEl valor máximo es " + maximo + " y aparece " + repeticionMax + vezMax);
        System.out.println("**************************************");
        System.out.println("El valor mínimo es " + minimo + " y aparece " + repeticionMin + vezMin);
        input.close();
    }
}
