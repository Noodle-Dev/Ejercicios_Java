import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {
        int[] arreglo = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        Arrays.sort(arreglo);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número a buscar: ");
        int numero = scanner.nextInt();
        
        int resultado = busquedaBinaria(arreglo, numero);
        
        if (resultado == -1) {
            System.out.println("El número no se encuentra en el arreglo.");
        } else {
            System.out.println("El número se encuentra en la posición: " + resultado);
        }
    }
    
    public static int busquedaBinaria(int[] arreglo, int numero) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;
        
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            
            if (arreglo[medio] == numero) {
                return medio;
            }
            
            if (arreglo[medio] < numero) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        
        return -1;
    }
}