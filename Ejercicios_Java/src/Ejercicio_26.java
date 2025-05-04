import java.util.Scanner;

public class Ejercicio_26 {
    public static void main(String[] args) {
        int[][][] matriz3D = new int[3][3][3];
        Scanner scanner = new Scanner(System.in);
        
        //Valores default
        int valor = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    matriz3D[i][j][k] = valor++;
                }
            }
        }
        
        System.out.println("Matriz tridimensional creada con valores del 1 al 27.");
        
        System.out.print("\nIngrese el número a buscar (1-27): ");
        int numero = scanner.nextInt();
        
        buscarEnMatriz3D(matriz3D, numero);
    }
    
    public static void buscarEnMatriz3D(int[][][] matriz, int numero) {
        boolean encontrado = false;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    if (matriz[i][j][k] == numero) {
                        System.out.println("El número " + numero + " se encuentra en las coordenadas: [" + i + "][" + j + "][" + k + "]");
                        encontrado = true;
                        return;
                    }
                }
            }
        }
        
        if (!encontrado) {
            System.out.println("El número " + numero + " no se encuentra en la matriz.");
        }
    }
}