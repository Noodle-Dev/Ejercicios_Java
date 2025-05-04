import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_18 {
    public static void main(String[] args) {
        String[] palabras = {"avion", "barco", "casa", "dado", "elefante", "foca", "gato", "hola", "iglesia"};
        Arrays.sort(palabras); // Asegurar que esté ordenado
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = scanner.nextLine().toLowerCase();
        
        int resultado = busquedaBinaria(palabras, palabra);
        
        if (resultado == -1) {
            System.out.println("La palabra no se encuentra en el arreglo.");
        } else {
            System.out.println("La palabra se encuentra en la posición: " + resultado);
        }
    }
    
    public static int busquedaBinaria(String[] arreglo, String palabra) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;
        
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            int comparacion = arreglo[medio].compareTo(palabra);
            
            if (comparacion == 0) {
                return medio;
            }
            
            if (comparacion < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        
        return -1;
    }
}