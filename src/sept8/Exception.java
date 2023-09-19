package sept8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        int[] arr = {3, 2, -4, 8, 4, 0, 6};
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        try {
            int num = input.nextInt();
            double result = (double) arr[num] / arr[num + 1];
            if (arr[num + 1] <= 0) throw new MyError();
            System.out.println("El resultado de la operacion es " + result);
        } catch (InputMismatchException e) {
            System.out.println("Se ingreso un caracter invalido!");
        } catch (MyError myE) {
            System.out.println(myE.toString());
        }
        input.close();
    }
}
