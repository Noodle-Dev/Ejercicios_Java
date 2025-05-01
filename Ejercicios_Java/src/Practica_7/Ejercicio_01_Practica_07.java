package Practica_7;
public class Ejercicio_01_Practica_07 {
    public static void main(String[] args) throws Exception {
        int[] n = {1, 2, 3, 4, 5, 6};
        
        // Mostrar el arreglo original
        for(int i = 0; i < n.length; i++){
            System.out.println(n[i]);
        }
        
        System.out.println("------------------");
        
        for(int i = 0; i < n.length; i++){
            if(n[i] % 2 == 0){
                n[i] = n[i] * 2;
            }
            System.out.println(n[i]);
        }
    }
}