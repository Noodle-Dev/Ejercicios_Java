import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto:");
        String texto = scanner.nextLine().toLowerCase(); 

        int[] frecuencias = new int[26];

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (caracter >= 'a' && caracter <= 'z') {
                frecuencias[caracter - 'a']++;
            }
        }
        System.out.println("\nHistograma de frecuencias de letras:");
        for (int i = 0; i < frecuencias.length; i++) {
            if (frecuencias[i] > 0) {
                char letra = (char) ('a' + i);
                System.out.print(letra + ": ");
                for (int j = 0; j < frecuencias[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
        scanner.close();
    }
}