package Ej_semana3;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arr4 {
    public static void main(String[] args) {
        String[][] matriz = {
                {"", "CABA", "Rosario", "Cordoba"},
                {"enero", "", "", ""},
                {"febrero", "", "", ""},
                {"marzo", "", "", ""},
                {"mayo", "", "", ""}
        };
        int maxCiudadCant = 0, maxMesCant = 0;
        StringBuilder maxCiudad = new StringBuilder();
        StringBuilder maxMes = new StringBuilder();
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            int auxSum = 0;
            for (int j = 1; j < 5; j++) {
                System.out.print("Ingrese la cantidad de lluvia en " + matriz[0][i] + " en " + matriz[j][0] + " : ");
                int aux = input.nextInt();
                auxSum += aux;
                matriz[j][i] = Integer.toString(aux);
            }
            if (auxSum > maxCiudadCant) {
                maxCiudadCant = auxSum;
                maxCiudad = new StringBuilder(matriz[0][i]);
            } else if (auxSum == maxCiudadCant) {
                maxCiudad.append(" y en ").append(matriz[0][i]);
            }
        }
        input.close();
        for (int i = 1; i < 5; i++) {
            int auxSum = 0;
            for (int j = 1; j < 4; j++) {
                auxSum += Integer.parseInt(matriz[i][j]);
            }
            if (auxSum > maxMesCant) {
                maxMesCant = auxSum;
                maxMes = new StringBuilder(matriz[i][0]);
            } else if (auxSum == maxMesCant) {
                maxMes.append(" y en ").append(matriz[i][0]);
            }
        }
        System.out.println("\nEn " + maxMes + " llovió mas que en los otros meses. Cantidad total de mm: " + maxMesCant);
        System.out.println("En " + maxCiudad + " llovió mas que en las otras ciudades. Cantidad total de mm: " + maxCiudadCant);
        if (maxCiudad.toString().equals("Rosario")) System.out.println("Seee, aguante Rosario!");
    }
}
