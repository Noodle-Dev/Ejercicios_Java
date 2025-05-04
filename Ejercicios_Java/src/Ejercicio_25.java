import java.util.Scanner;

public class Ejercicio_25 {
    public static void main(String[] args) {
        int[][][] matriz3D = new int[3][3][3];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese los elementos de la matriz 3x3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("Elemento [" + i + "][" + j + "][" + k + "]: ");
                    matriz3D[i][j][k] = scanner.nextInt();
                }
            }
        }
        
        System.out.println("\nMatriz tridimensional:");
        mostrarMatriz3D(matriz3D);
    }
    
    public static void mostrarMatriz3D(int[][][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Capa " + i + ":");
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    System.out.print(matriz[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}