import java.util.Scanner;
public class Ejercicio_16 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = {"hola", "java", "youtube"};

        System.out.println("Ingresa una palabra we");
        String buscada = scanner.nextLine();
        boolean encontrada = false;

        for(String palabra : palabras){
            if(palabra.equalsIgnoreCase(buscada)){
                System.out.println("La palabra fue encontrada we");
                encontrada = true;
                break;
            }
        }

        if(!encontrada){
            System.out.println("La palabra NO fue encontrada we");
            
        }


    }
}
//{} []