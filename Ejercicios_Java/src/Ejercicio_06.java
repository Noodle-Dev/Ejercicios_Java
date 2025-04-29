import java.util.Scanner;

public class Ejercicio_06 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[6];

        System.out.println("Ingresa hasta 4 nombres");

        for(int i = 0; i < 4; i++){
            System.out.print("Nombre " + (i+1)+ ": ");
            nombres[i] = scanner.nextLine();
        }
        System.out.println("Nombres ingresados: ");
        for(String nombre : nombres){
            if(nombre != null && !nombre.isEmpty()){
                System.out.println(nombre);
            }
        }
    }
}
