public class Automovil {
   
    private double precio;
    private String color;
    
    // Constructor
    public Automovil(double precio, String color) {
        this.precio = precio;
        this.color = color;
    }
    
    // Constructor vacío
    public Automovil() {
        this.precio = 0.0;
        this.color = "";
    }
    
    // GET
    public double getPrecio() {
        return precio;
    }
    
    public String getColor() {
        return color;
    }
    
    // SET
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    // Método para mostrar información del automóvil
    public void mostrarInformacion() {
        System.out.println("Color: " + color + " | Precio: $" + precio);
    }
    
    @Override
    public String toString() {
        return "Automóvil [Color: " + color + ", Precio: $" + precio + "]";
    }
}