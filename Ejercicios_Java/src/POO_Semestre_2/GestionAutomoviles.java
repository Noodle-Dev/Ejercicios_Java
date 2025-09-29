import java.util.Scanner;

public class GestionAutomoviles {

    private static Automovil[] automoviles = new Automovil[8];
    private static int contadorAutos = 0;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion;
        
        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    capturarAutomovil();
                    break;
                case 2:
                    imprimirAutomoviles();
                    break;
                case 3:
                    buscarAutomovil();
                    break;
                case 4:
                    modificarAutomovil();
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            
        } while (opcion != 5);
        
        scanner.close();
    }
    
    //mostrar el menú
    public static void mostrarMenu() {
        System.out.println("\n=== SISTEMA DE GESTIÓN DE AUTOMÓVILES ===");
        System.out.println("1. Capturar automóvil");
        System.out.println("2. Imprimir todos los automóviles");
        System.out.println("3. Buscar automóvil");
        System.out.println("4. Modificar automóvil");
        System.out.println("5. Salir");
        System.out.println("==========================================");
    }
    
    // capturar un automóvil
    public static void capturarAutomovil() {
        if (contadorAutos >= automoviles.length) {
            System.out.println("El vector está lleno. No se pueden agregar más automóviles.");
            return;
        }
        
        System.out.println("\n--- CAPTURAR NUEVO AUTOMÓVIL ---");
        
        System.out.print("Ingrese el precio del automóvil: $");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Ingrese el color del automóvil: ");
        String color = scanner.nextLine();
        
        // Crear y almacenar el nuevo automóvil
        automoviles[contadorAutos] = new Automovil(precio, color);
        contadorAutos++;
        
        System.out.println("Automóvil capturado exitosamente!");
    }
    
    // imprimir todos los automóviles
    public static void imprimirAutomoviles() {
        System.out.println("\n--- LISTA DE TODOS LOS AUTOMÓVILES ---");
        
        if (contadorAutos == 0) {
            System.out.println("No hay automóviles registrados.");
            return;
        }
        
        for (int i = 0; i < contadorAutos; i++) {
            System.out.print("Automóvil #" + (i + 1) + " -> ");
            automoviles[i].mostrarInformacion();
        }
        
        System.out.println("Total de automóviles: " + contadorAutos);
    }
    
    // Método de búsqueda (EXTRA)
    public static void buscarAutomovil() {
        System.out.println("\n--- BUSCAR AUTOMÓVIL ---");
        System.out.println("1. Buscar por color");
        System.out.println("2. Buscar por rango de precio");
        System.out.print("Seleccione opción de búsqueda: ");
        
        int opcionBusqueda = scanner.nextInt();
        scanner.nextLine();
        
        boolean encontrado = false;
        
        switch (opcionBusqueda) {
            case 1:
                System.out.print("Ingrese el color a buscar: ");
                String colorBuscado = scanner.nextLine();
                
                System.out.println("\nResultados de búsqueda por color: '" + colorBuscado + "'");
                for (int i = 0; i < contadorAutos; i++) {
                    if (automoviles[i].getColor().equalsIgnoreCase(colorBuscado)) {
                        System.out.print("Automóvil #" + (i + 1) + " -> ");
                        automoviles[i].mostrarInformacion();
                        encontrado = true;
                    }
                }
                break;
                
            case 2:
                System.out.print("Ingrese precio mínimo: $");
                double precioMin = scanner.nextDouble();
                System.out.print("Ingrese precio máximo: $");
                double precioMax = scanner.nextDouble();
                
                System.out.println("\nResultados de búsqueda por precio ($" + precioMin + " - $" + precioMax + ")");
                for (int i = 0; i < contadorAutos; i++) {
                    if (automoviles[i].getPrecio() >= precioMin && automoviles[i].getPrecio() <= precioMax) {
                        System.out.print("Automóvil #" + (i + 1) + " -> ");
                        automoviles[i].mostrarInformacion();
                        encontrado = true;
                    }
                }
                break;
                
            default:
                System.out.println("Opción de búsqueda no válida.");
                return;
        }
        
        if (!encontrado) {
            System.out.println("No se encontraron automóviles con los criterios especificados.");
        }
    }
    
    // Modificar automóvil
    public static void modificarAutomovil() {
        if (contadorAutos == 0) {
            System.out.println("No hay automóviles registrados para modificar.");
            return;
        }
        
        System.out.println("\n--- MODIFICAR AUTOMÓVIL ---");
        imprimirAutomoviles();
        
        System.out.print("Seleccione el número del automóvil a modificar (1-" + contadorAutos + "): ");
        int numeroAuto = scanner.nextInt();
        scanner.nextLine(); 
        
        if (numeroAuto < 1 || numeroAuto > contadorAutos) {
            System.out.println("Número de automóvil no válido.");
            return;
        }
        
        int indice = numeroAuto - 1;
        
        System.out.println("Automóvil seleccionado:");
        automoviles[indice].mostrarInformacion();
        
        System.out.println("\n¿Qué desea modificar?");
        System.out.println("1. Precio");
        System.out.println("2. Color");
        System.out.println("3. Ambos");
        System.out.print("Seleccione una opción: ");
        
        int opcionModificar = scanner.nextInt();
        scanner.nextLine(); 
        
        switch (opcionModificar) {
            case 1:
                System.out.print("Ingrese nuevo precio: $");
                double nuevoPrecio = scanner.nextDouble();
                automoviles[indice].setPrecio(nuevoPrecio);
                break;
                
            case 2:
                System.out.print("Ingrese nuevo color: ");
                String nuevoColor = scanner.nextLine();
                automoviles[indice].setColor(nuevoColor);
                break;
                
            case 3:
                System.out.print("Ingrese nuevo precio: $");
                nuevoPrecio = scanner.nextDouble();
                scanner.nextLine(); 
                System.out.print("Ingrese nuevo color: ");
                nuevoColor = scanner.nextLine();
                
                automoviles[indice].setPrecio(nuevoPrecio);
                automoviles[indice].setColor(nuevoColor);
                break;
                
            default:
                System.out.println("Opción no válida.");
                return;
        }
        
        System.out.println("Automóvil modificado exitosamente!");
        System.out.println("Datos actualizados:");
        automoviles[indice].mostrarInformacion();
    }
}