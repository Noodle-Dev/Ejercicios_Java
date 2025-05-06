import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] edades = new int[100];
        int contador = 0;
        
        System.out.println("Ingrese las edades (ingrese un número negativo para terminar):");

        while (true) {
            System.out.print("Edad " + (contador + 1) + ": ");
            int edad = scanner.nextInt();
            
            if (edad < 0) {
                break;
            }
            
            edades[contador] = edad;
            contador++;
        }
        
        if (contador == 0) {
            System.out.println("No se ingresaron edades válidas.");
        } else {
            int suma = 0;
            for (int i = 0; i < contador; i++) {
                suma += edades[i];
            }
            
            double promedio = (double) suma / contador;
            System.out.println("\nPromedio de edades: " + promedio);
        }
        
        scanner.close();
    }
}