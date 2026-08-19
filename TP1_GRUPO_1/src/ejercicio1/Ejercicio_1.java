package ejercicio1;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Gerente", "12345678", "Juan", "Perez", 30, null, "Masculino", "Calle 123", "123456789", "juan.perez@email.com");
        System.out.println(empleado1.toString());
        
        // Impresión del proximo legajo
        System.out.println("El proximo legajo es: " + Empleado.devuelveProximoLegajo());

        Empleado empleado2 = new Empleado("Supervisor", "91011121", "Alberto", "Gutierrez", 40, null, "Masculino", "Calle 456", "1145342124", "albertito.guti@gmail.com");
        System.out.println(empleado2.toString());
        
        // Impresión del proximo legajo
        System.out.println("El proximo legajo es: " + Empleado.devuelveProximoLegajo());

        // Impresion de empeado sin parametros o por defecto
        Empleado empleado3 = new Empleado();
        System.out.println(empleado3.toString());
    }
}
