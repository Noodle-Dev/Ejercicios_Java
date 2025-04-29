public class Ejercicio_05 {
    public static void main(String[] args) throws Exception {
        int[] arreglo = new int[10];
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = i + 1;
        }
        System.out.println("El arreglo tiene " + arreglo.length + " elementos");
        System.out.println("Elementos del arreglo: ");
        for(int num : arreglo){
            System.out.print(num+" ");
        }
    }
}
