public class Ejercicio_09 {
    public static void main(String[] args) throws Exception {
        int[] arreglo = {1, 2, 3, 4, 5};
        System.out.println("Arreglo original: ");
        for(int num : arreglo){
            System.out.print(num + " ");
        }

        int ultimo = arreglo[arreglo.length - 1];
        for(int i = arreglo.length - 1; i >0; i--){
            arreglo[i] = arreglo[i - 1];
        }
        arreglo[0] = ultimo;

        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("Arreglo despues de desplazamiento: ");
        for(int num : arreglo){
            System.out.print(num + " ");
        }
    }
}

