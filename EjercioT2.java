
package programas;

import java.util.Scanner;
public class EjercioT2 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] compras = new double[4][4];
        double totalCompras = 0;
        int cantidadElementos = 4 * 4;

        System.out.println("Ingrese los montos de las compras para cada posicion de la matriz 4x4:");

        // Llenar la matriz con los valores de compras y calcular el total
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Compra en [" + i + "][" + j + "]: ");
                compras[i][j] = scanner.nextDouble();
                totalCompras += compras[i][j];  // Sumar cada compra al total
            }
        }

        // Calcular el promedio de las compras
        double promedioCompras = totalCompras / cantidadElementos;

        // Mostrar el resultado del total y el promedio de las compras
        System.out.println("\nTotal de compras: " + totalCompras);
        System.out.println("Promedio de compras: " + promedioCompras);
    }
}

