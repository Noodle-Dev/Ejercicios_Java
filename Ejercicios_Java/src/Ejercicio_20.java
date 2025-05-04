import java.util.Scanner;

public class Ejercicio_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de palabras a ordenar: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        String[] palabras = new String[n];
        
        System.out.println("Ingrese las palabras:");
        for (int i = 0; i < n; i++) {
            palabras[i] = scanner.nextLine();
        }
        
        ordenarPorSeleccion(palabras);
        
        System.out.println("Palabras ordenadas:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
    
    public static void ordenarPorSeleccion(String[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j].compareToIgnoreCase(arreglo[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            
            // Intercambiar
            String temp = arreglo[minIndex];
            arreglo[minIndex] = arreglo[i];
            arreglo[i] = temp;
        }
    }
}