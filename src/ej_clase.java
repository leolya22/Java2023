import java.util.Scanner;

public class ej_clase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su peso en kg: ");
        double peso = input.nextDouble();
        System.out.print("Ingrese su altura en metros : ");
        double altura = input.nextDouble();
        double imc = peso / Math.pow(altura, 2);
        if (imc < 18.5) {
            System.out.println("Estas por debajo del peso ideal!");
        } else if (imc > 25.0) {
            System.out.println("Tenés sobrepeso!");
        } else {
            System.out.println("Tenés el peso ideal");
        }
        System.out.println("IMC : " + imc);
        input.close();
    }
}
