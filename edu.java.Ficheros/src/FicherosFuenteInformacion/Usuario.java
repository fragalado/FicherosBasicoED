package FicherosFuenteInformacion;

public class Usuario {
	
	// Atributos
	
	private String nombre, apellidos;
	private int edad;

	// Constructores
	
	public Usuario(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	// Getter y Setter -> Ninguno
	
	
	// Metodos
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}
}
