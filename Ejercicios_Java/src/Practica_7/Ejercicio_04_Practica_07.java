package Practica_7;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio_04_Practica_07 {
    public static void main(String[] args) {
        int[] array = {120, 135, 140, 110, 150, 155, 160, 145, 130, 135};
        detectarDuplicados(array);
    }
    
    public static void detectarDuplicados(int[] arr) {
        Map<Integer, Integer> frecuencia = new HashMap<>();
        boolean hayDuplicados = false;
        
        for (int num : arr) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("El número " + entry.getKey() + " se repite " + entry.getValue() + " veces");
                hayDuplicados = true;
            }
        }
        
        if (!hayDuplicados) {
            System.out.println("No hay duplicados");
        }
    }
}