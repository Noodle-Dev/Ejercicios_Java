import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        System.out.println("Ingrese 5 numeros enteros");
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }


        double promedio = (double) suma / numeros.length;

        System.out.println("Numeros ingresados: ");
        for(int num :  numeros){
            System.out.print(num + ", ");
        }
        System.out.println("Promedio: " + promedio);
    }
}
