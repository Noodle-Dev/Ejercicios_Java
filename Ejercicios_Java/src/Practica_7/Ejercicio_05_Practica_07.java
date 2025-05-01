package Practica_7;

public class Ejercicio_05_Practica_07 {
    public static void main(String[] args) {
        int[] array = {120, 135, 140, 110, 150, 155, 160, 145, 130};
        int[] maxMin = encontrarMaxMin(array);
        
        System.out.println("Valor máximo: " + maxMin[0]);
        System.out.println("Valor mínimo: " + maxMin[1]);
    }
    
    public static int[] encontrarMaxMin(int[] arr) {
        if (arr.length == 0) return new int[0];
        
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return new int[]{max, min};
    }
}