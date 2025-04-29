import java.util.Scanner;
public class Ejercicio_11 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantas notas desea ingresar?");
        int cantidad = scanner.nextInt();

        double[] notas = new double[cantidad];
        double suma = 0;

        for(int i = 0; i < cantidad; i++){
            System.out.println("Ingrese la nota " + (i + 1));
            notas[i] = scanner.nextDouble();
            suma += notas[i];
        }
        double promedio = suma / cantidad;
        System.out.println("El promedio de las notas es " + promedio);

    }
}
//{} []