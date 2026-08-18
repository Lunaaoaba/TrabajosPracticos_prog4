package ejercicio1;
import java.time.LocalDate;

public class Persona {
	
	private String dni;
	private String nombre;
	private String apellido;
	private int edad;
	private LocalDate fechaNacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;
	
	public Persona(){
		this.dni = "00000000";
		this.nombre = "Sin nombre";
		this.apellido = "Sin apellido";
		this.edad = 99;
		this.fechaNacimiento = null;
		this.genero = "Sin género";
		this.direccion = "Sin dirección";
		this.telefono = "Sin teléfono";
		this.email = "Sin email";
	}
	public Persona(String Dni, String Nombre, String Apellido, int Edad, LocalDate FechaNacimiento,
				   String Genero, String Direccion, String Telefono, String Email){
		this.dni = Dni;
		this.nombre = Nombre;
		this.apellido = Apellido;
		this.edad = Edad;
		this.fechaNacimiento = FechaNacimiento;
		this.genero = Genero;
		this.direccion = Direccion;
		this.telefono = Telefono;
		this.email = Email;
	}
	
}
