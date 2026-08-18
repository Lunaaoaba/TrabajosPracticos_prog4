package ejercicio1;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Gerente", "12345678", "Juan", "Perez", 30, null, "Masculino", "Calle 123", "123456789", "juan.perez@email.com");
        System.out.println(empleado1.toString());
        
        Empleado empleado2 = new Empleado("Supervisor", "91011121", "Alberto", "Gutierrez", 40, null, "Masculino", "Calle 456", "1145342124", "albertito.guti@gmail.com");
        System.out.println(empleado2.toString());
        
     
        
    }
}
