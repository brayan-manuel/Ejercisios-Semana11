package programas;
import java.util.Random;
public class EjercioT3 {
  public static void main(String[] args) {
        Random random = new Random();
        int[][] ventas = new int[4][4];
        int ventaMayor = Integer.MIN_VALUE;
        int ventaMenor = Integer.MAX_VALUE;

        System.out.println("Ventas generadas aleatoriamente en la matriz 4x4:");

        // Llenar la matriz con valores aleatorios y encontrar la venta mayor y menor
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ventas[i][j] = random.nextInt(4991) + 10;  // Genera un número entre 10 y 5000
                System.out.print(ventas[i][j] + "\t");  // Imprimir cada venta

                // Determinar la venta mayor y menor
                if (ventas[i][j] > ventaMayor) {
                    ventaMayor = ventas[i][j];
                }
                if (ventas[i][j] < ventaMenor) {
                    ventaMenor = ventas[i][j];
                }
            }
            System.out.println();  // Salto de línea por cada fila
        }

        // Mostrar la venta mayor y menor
        System.out.println("\nVenta mayor: " + ventaMayor);
        System.out.println("Venta menor: " + ventaMenor);
    }
}

