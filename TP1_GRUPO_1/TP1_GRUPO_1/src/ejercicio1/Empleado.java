package ejercicio1;

import java.time.LocalDate;

public class Empleado extends Persona {
    private static final int legajo = 1000;
    private String puesto;

    public Empleado() {
        super();
        this.puesto = " Sin puesto ";
    }
    
    public Empleado(String puesto, String Dni, String Nombre, String Apellido, int Edad, LocalDate FechaNacimiento,
			   String Genero, String Direccion, String Telefono, String Email) {
    	super(Dni, Nombre, Apellido, Edad, FechaNacimiento, Genero, Direccion, Telefono, Email);
    	 this.puesto = puesto;
    } 
} 