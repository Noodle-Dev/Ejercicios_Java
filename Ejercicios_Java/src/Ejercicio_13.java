import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] frecuencias = new int[10];

        System.out.println("Cuantos numeros desea ingresar");
        int cantidad = scanner.nextInt();

        System.out.println("Ingrese numeros entre 1 y 10");
        for(int i = 0; i < cantidad; i++){
            System.out.println("Numero " + (i + 1) + ": ");
            int num = scanner.nextInt();

            if(num >= 1 && num <= 10){
                frecuencias[num - 1]++; 
            }

        }

        System.out.println("Histograma: ");
        for(int i = 0; i < frecuencias.length; i++){
            System.out.println((i + 1) + ": ");
            for(int j = 0; j < frecuencias[i]; i++){
                System.out.println("*");
            }
            System.out.println("");
        }

    }
}
//{} []