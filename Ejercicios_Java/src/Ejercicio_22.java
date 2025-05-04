import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de palabras a ordenar: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        
        ArrayList<String> palabras = new ArrayList<>();
        
        System.out.println("Ingrese las palabras:");
        for (int i = 0; i < n; i++) {
            palabras.add(scanner.nextLine());
        }
        
        Collections.sort(palabras);
        
        System.out.println("Palabras ordenadas:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}