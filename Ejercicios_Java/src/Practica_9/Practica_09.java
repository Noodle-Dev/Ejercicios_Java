package Practica_9;
import java.util.Scanner;
import java.util.Arrays;

/*
============================================================================
* Programa: Análisis de Arreglo Numérico
* Autor: Alejandro Alonso Membrila, Hassan Karim Leyva Esquivel, Rigoberto Ordaz Cavadaz, Patrick Rubi Garcia Sandoval
* Fecha: 14 mayo 2024
* Descripción:
* Este programa permite analizar un arreglo de números mediante un menú interactivo
* con diversas opciones de procesamiento, aplicando principios de programación modular.
============================================================================
*/

public class Practica_09 {
    
    // Arreglo de números proporcionado en la práctica
    private static final int[] numeros = {
        12, -7, 35, 0, 8, 19, 24, -3, 11, 6,
        9, 14, -21, 17, 22, 4, 3, -11, 18, 20,
        27, -5, 2, 13, 16, -8, 5, 31, -2, 10,
        7, -9, 15, 28, 33, 1, -4, 26, 30, -6
    };
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    mostrarNumeros(numeros);
                    break;
                case 2:
                    mostrarMayorYMenor(numeros);
                    break;
                case 3:
                    mostrarPromedio(numeros);
                    break;
                case 4:
                    contarParesEImpares(numeros);
                    break;
                case 5:
                    buscarNumeroEnArreglo(numeros, scanner);
                    break;
                case 6:
                    ordenarYMostrar(numeros);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            
            if (opcion != 7) {
                System.out.println("\nPresione Enter para continuar...");
                scanner.nextLine(); 
                scanner.nextLine(); // Esperar Enter
            }
            
        } while (opcion != 7);
        
        scanner.close();
    }
    
    /**
     * Muestra el menú de opciones disponibles
     */
    public static void mostrarMenu() {
        System.out.println("\n---- MENÚ DE ANÁLISIS DE ARREGLO ----");
        System.out.println("1. Mostrar todos los números");
        System.out.println("2. Mostrar el número mayor y el menor");
        System.out.println("3. Calcular el promedio");
        System.out.println("4. Contar pares e impares");
        System.out.println("5. Buscar un número");
        System.out.println("6. Ordenar números (ascendente)");
        System.out.println("7. Salir");
    }
    
    //Muestra todo el arreglo
    public static void mostrarNumeros(int[] arreglo) {
        System.out.println("\nNúmeros en el arreglo:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + (i < arreglo.length - 1 ? ", " : ""));
            if ((i + 1) % 10 == 0) System.out.println(); // Salto de línea cada 10 números
        }
    }
    
    //Muestra el numero mayor y el menor
    public static void mostrarMayorYMenor(int[] arreglo) {
        int mayor = encontrarMayor(arreglo);
        int menor = encontrarMenor(arreglo);
        System.out.println("\nNúmero mayor: " + mayor);
        System.out.println("Número menor: " + menor);
    }

    //Muestra el numero mayor del arreglo
    public static int encontrarMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int num : arreglo) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }
    
    //Encuentra el numero menor del arreglo
    public static int encontrarMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int num : arreglo) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }
    
   //Muestra el promedio del arreglo
    public static void mostrarPromedio(int[] arreglo) {
        double promedio = calcularPromedio(arreglo);
        System.out.printf("\nPromedio de los números: %.2f\n", promedio);
    }
    
    //Calculo del promedio
    public static double calcularPromedio(int[] arreglo) {
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return (double) suma / arreglo.length;
    }
    
    //Cuenta la cantidad de numero pares e impares
    public static void contarParesEImpares(int[] arreglo) {
        int pares = 0, impares = 0;
        for (int num : arreglo) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("\nCantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
    
    //Busca un numero especifico intriducido por el usuario
    public static void buscarNumeroEnArreglo(int[] arreglo, Scanner scanner) {
        System.out.print("\nIngrese el número a buscar: ");
        int buscado = scanner.nextInt();
        boolean encontrado = buscarNumero(arreglo, buscado);
        
        if (encontrado) {
            System.out.println("El número " + buscado + " SÍ está en el arreglo.");
        } else {
            System.out.println("El número " + buscado + " NO está en el arreglo.");
        }
    }
    
    //busca el nunmero en el arreglo intruducido por el usuario
    public static boolean buscarNumero(int[] arreglo, int buscado) {
        for (int num : arreglo) {
            if (num == buscado) {
                return true;
            }
        }
        return false;
    }
    
   //Ordena y muestra el arreglo en orden ascendente
    public static void ordenarYMostrar(int[] arreglo) {
        // copia pa no modificar el original
        int[] copia = Arrays.copyOf(arreglo, arreglo.length);
        ordenarAscendente(copia);
        
        System.out.println("\nNúmeros ordenados ascendentemente:");
        for (int i = 0; i < copia.length; i++) {
            System.out.print(copia[i] + (i < copia.length - 1 ? ", " : ""));
            if ((i + 1) % 10 == 0) System.out.println(); // Salto de línea cada 10 números
        }
    }
    
    //Ordena con ordenamiento burbuja
    public static void ordenarAscendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
}