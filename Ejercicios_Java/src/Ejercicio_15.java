import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {10,20,30,40,50,60,70,80,90,100};

        System.out.println("E we que valor quieres we");
        int buscado = scanner.nextInt();
        boolean encontrado = false;

        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] == buscado) {
                System.out.println("Felicidades we, si esta en lista");
                encontrado = true;
                break;  
            }
        }
        if(!encontrado){
            System.out.println("NO esta en la lista");

        }

    }
}
//{} []