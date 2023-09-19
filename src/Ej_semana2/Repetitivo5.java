package Ej_semana2;

import java.util.Scanner;

public class Repetitivo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        boolean nums = true;
        System.out.print("Ingrese un numero: ");
        int aux = input.nextInt();
        int maximo = aux;
        int minimo = aux;
        int posicion = 1;
        String posicionMax = posicion + ", ";
        String posicionMin = posicion + ", ";
        while (nums) {
            posicion++;
            System.out.print("Tiene mas números para ingresar?");
            String a = inputText.nextLine();
            if (a.equalsIgnoreCase("no")) nums = false;
            else {
                System.out.print("Ingrese un numero: ");
                aux = input.nextInt();
                if (aux > maximo) {
                    maximo = aux;
                    posicionMax = posicion + ", ";
                } else if (aux == maximo) {
                    posicionMax += posicion + ", ";
                }
                if (aux < minimo) {
                    minimo = aux;
                    posicionMin = posicion + ", ";
                } else if (aux == minimo) {
                    posicionMin += posicion + ", ";
                }

            }
        }
        System.out.println("El valor máximo es " + maximo + " y aparece en las posiciones " + posicionMax);
        System.out.println("El valor mínimo es " + minimo + " y aparece en las posiciones " + posicionMin);
        input.close();
    }
}
