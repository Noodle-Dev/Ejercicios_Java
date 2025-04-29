public class Ejercicio_07 {
    public static void main(String[] args) throws Exception {
        int[] arregloOriginal = {10, 20, 30, 40, 50};
        int[] arregloCopia = new int[arregloOriginal.length];

        for(int i = 0; i < arregloOriginal.length; i++){
            arregloCopia[i] = arregloOriginal[i];
        }

        System.out.println("Arreglo orginal: ");
        for(int num : arregloOriginal){
            System.out.print(num+", ");
        }

        System.out.println("");
        System.out.println("---------------");
        System.out.println("Arreglo copia: ");
        for(int num : arregloCopia){
            System.out.print(num+", ");
        }
    }
}
