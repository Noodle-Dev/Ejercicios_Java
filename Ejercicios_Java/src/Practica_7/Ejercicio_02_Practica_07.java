package Practica_7;
public class Ejercicio_02_Practica_07 {
    public static void main(String[] args) throws Exception {
        int[] n = {120, -135, 140, -110, 150, 155, -160, 145, 130};
        int sumNegativos = 0;
        int sumPositivos = 0;

        //Arreglos negativos
        for(int i = 0; i < n.length; i++){
            if(n[i] < 0){
                System.out.println(n[i]);
                sumNegativos += n[i];
                
            }
            
        }
        System.out.println("La suma de los negativos es: " + sumNegativos);
        System.out.println("------------------");

        //Arreglos positivos
        for(int i = 0; i < n.length; i++){
            if(n[i] > 0){
                System.out.println(n[i]);
                sumPositivos += n[i];
            }
        }
        System.out.println("La suma de los positivos es: " + sumPositivos);
        System.out.println("------------------");
    }
}
