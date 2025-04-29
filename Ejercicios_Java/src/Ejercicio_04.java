public class Ejercicio_04 {
    public static void main(String[] args) throws Exception {
       int[] calificaciones = {99, 100, 43, 60, 80};
       int suma = 0;

       for(int calificacion : calificaciones){
        suma+= calificacion;
       }

       double promedio = (double) suma / calificaciones.length;
       System.out.println("Calificaciones: ");

       for(int i = 0; i < calificaciones.length; i++){
            System.out.println("Estudiante " + (i+1) + ": "+calificaciones[i]);
       }

       System.out.println("Promedio " + promedio);

    }
}
