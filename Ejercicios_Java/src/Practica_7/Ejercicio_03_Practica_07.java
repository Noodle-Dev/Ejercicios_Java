package Practica_7;

import java.util.Arrays;
public class Ejercicio_03_Practica_07 {
    public static void main(String[] args) {

        int [] numeros={120, 135, 140, 110, 150, 155, 160, 145, 130};
        int n=5;

        System.out.println("Arreglo: "+ Arrays.toString(numeros));

        System.out.println();

        ResultadoSubarreglo resultado = SubarregloMayor(numeros, n);
        System.out.println("El subarreglo con la mayor suma es: " + Arrays.toString(resultado.subarreglo));
        System.out.println("El resultado de la suma de estos valores es: " + resultado.sumaMayor );
    }

    static class ResultadoSubarreglo {
        int[] subarreglo;
        int sumaMayor;

        ResultadoSubarreglo(int[] subarreglo, int sumaMayor) {
            this.subarreglo = subarreglo;
            this.sumaMayor = sumaMayor;
        }
    }


    public static ResultadoSubarreglo SubarregloMayor (int [] numeros, int n){
        int suma;
        int sumaMayor= Integer.MIN_VALUE;
        int indice=0;

        for(int i=0;i<numeros.length-n;i++){
            suma=0;
            for(int j=i,k=0;k<n;j++,k++){
                suma+=numeros[j];
            }
            if(suma>sumaMayor){
                sumaMayor=suma;
                indice=i;
            }
        }
        int[] resultado=new int[n];
        for(int i=indice,j=0;j<n;i++,j++){

            resultado[j]=numeros[i];
        }
        return new ResultadoSubarreglo(resultado, sumaMayor);
    }
}
