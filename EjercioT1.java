
package programas;

import java.util.Scanner;
public class EjercioT1 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] ventas = new double[4][4];
        double totalVentas = 0;

        System.out.println("Ingrese las ventas para cada posicion de la matriz 4x4:");

        // Llenar la matriz con los valores de ventas y calcular el total
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Venta en [" + i + "][" + j + "]: ");
                ventas[i][j] = scanner.nextDouble();
                totalVentas += ventas[i][j];  // Sumar cada venta al total
            }
        }

        // Mostrar el resultado del total de ventas
        System.out.println("\nTotal de ventas: " + totalVentas);
    }
}
