package Ej_semana2;

import java.util.Scanner;

public class condicionales5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int a = input.nextInt();
        System.out.print("Ingrese un numero mas: ");
        int b = input.nextInt();
        boolean exito;
        do {
            exito = true;
            System.out.print("Ingrese una de las siguientes opciones: sumar, restar, multiplicar, dividir - ");
            String operacion = inputText.nextLine().toLowerCase();
            switch (operacion) {
                case "sumar" -> System.out.println("El resultado de la suma es: " + (a + b));
                case "restar" -> System.out.println("El resultado de la resta es: " + (a - b));
                case "multiplicar" -> System.out.println("El resultado de la multiplicación es: " + a * b);
                case "dividir" -> System.out.println("El resultado de la division es: " + a / b);
                default -> {
                    System.out.println("\n*******************Error 404*******************");
                    System.out.println("Operacion is not found, por favor pruebe de nuevo!\n");
                    exito = false;
                }
            }
        } while (!exito);

        inputText.close();
        input.close();
    }
}
