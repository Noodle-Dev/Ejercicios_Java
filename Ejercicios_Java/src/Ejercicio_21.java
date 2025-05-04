import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a ordenar: ");
        int n = scanner.nextInt();
        
        int[] numeros = new int[n];
        
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        Arrays.sort(numeros);
        
        System.out.println("Arreglo ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}