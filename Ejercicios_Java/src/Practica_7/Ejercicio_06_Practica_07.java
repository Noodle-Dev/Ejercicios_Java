package Practica_7;

import java.util.Arrays;

public class Ejercicio_06_Practica_07 {
    public static void main(String[] args) {
        int[] array = {120, 135, 140, 110, 150};
        int[] cuadrados = calcularCuadrados(array);
        
        System.out.println("Arreglo original: " + Arrays.toString(array));
        System.out.println("Arreglo de cuadrados: " + Arrays.toString(cuadrados));
    }
    
    public static int[] calcularCuadrados(int[] arr) {
        int[] cuadrados = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            cuadrados[i] = arr[i] * arr[i];
        }
        return cuadrados;
    }
}