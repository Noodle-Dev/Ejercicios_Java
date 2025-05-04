import java.util.Scanner;

public class Ejercicio_24 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese los elementos de la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nMatriz ingresada:");
        mostrarMatriz(matriz);
        
        System.out.print("\nIngrese el número de fila a promediar (0-3): ");
        int fila = scanner.nextInt();
        
        if (fila < 0 || fila > 3) {
            System.out.println("Fila no válida.");
            return;
        }
        
        double promedio = calcularPromedioFila(matriz, fila);
        System.out.println("El promedio de la fila " + fila + " es: " + promedio);
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static double calcularPromedioFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz[fila].length; j++) {
            suma += matriz[fila][j];
        }
        return (double) suma / matriz[fila].length;
    }
}