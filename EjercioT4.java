package programas;
import java.util.Random;
public class EjercioT4 {
  public static void main(String[] args) {
        Random random = new Random();
        int[][] ventas = new int[3][3];
        int totalVentas = 0;
        int cantidadElementos = 3 * 3;

        System.out.println("Ventas generadas aleatoriamente en la matriz 3x3:");

        // Llenar la matriz con valores aleatorios y calcular el total de las ventas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ventas[i][j] = random.nextInt(9001) + 1000;  // Genera un número entre 1000 y 10000
                System.out.print(ventas[i][j] + "\t");  // Imprimir cada venta
                totalVentas += ventas[i][j];  // Sumar cada venta al total
            }
            System.out.println();  // Salto de línea por cada fila
        }

        // Calcular el promedio de las ventas
        double promedioVentas = (double) totalVentas / cantidadElementos;

        // Mostrar el total y el promedio de las ventas
        System.out.println("\nTotal de ventas: " + totalVentas);
        System.out.println("Promedio de ventas: " + promedioVentas);
    }
}

