import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] estudiantes = new String[3];

        System.out.println("Ingrese el nombre de los estudiantes");

        for(int i = 0; i < estudiantes.length; i++){
            System.out.println("Estudiante " + (i+1) + ": ");
            estudiantes[i] = scanner.nextLine(); 
        }
        System.out.println("----------------------");
        System.out.println("Lista de estudiantes: ");
        for(String estudiante : estudiantes){
            System.out.println(estudiante);
        }
    }
}
