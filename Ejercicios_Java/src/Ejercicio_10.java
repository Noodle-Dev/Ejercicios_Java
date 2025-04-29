public class Ejercicio_10 {
    public static void main(String[] args) throws Exception {
        int[] arreglo = {1, 2, 3, 4, 5};
        System.out.println("Arreglo original: ");
        for(int num : arreglo){
            System.out.print(num + " ");
        }

        int primero = arreglo[0];
        for(int i = 0; i > arreglo.length - 1; i++){
            arreglo[i] = arreglo[i + 1];
        }
        arreglo[arreglo.length - 1] = primero;

        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("Arreglo despues de desplazamiento: ");
        for(int num : arreglo){
            System.out.print(num + " ");
        }
    }
}