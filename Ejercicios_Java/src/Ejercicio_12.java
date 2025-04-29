import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] edades = new int[100];
        int contador = 0;
        int suma = 0;
        
        System.out.println("Ingrese las edades (número negativo para terminar):");
        
        while (true) {
            System.out.print("Edad " + (contador + 1) + ": ");
            int edad = scanner.nextInt();
            
            if (edad < 0) {
                break;
            }
            
            edades[contador] = edad;
            suma += edad;
            contador++;
        }
        
        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio de edades es: " + promedio);
        } else {
            System.out.println("No se ingresaron edades válidas.");
        }
    }
}

//PENDIENTE