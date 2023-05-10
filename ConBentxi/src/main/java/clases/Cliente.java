package clases;

public class Cliente {

	private String dni;
	private String nombre;
	private String apellido;
	private boolean mayor_edad;
	private int num_tarjeta;
	
	
	public Cliente() {}
	
	
	public Cliente(String dni, String nombre, String apellido, boolean mayor_edad, int num_tarjeta) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mayor_edad = mayor_edad;
		this.num_tarjeta = num_tarjeta;
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public boolean isMayor_edad() {
		return mayor_edad;
	}
	public void setMayor_edad(boolean mayor_edad) {
		this.mayor_edad = mayor_edad;
	}
	public int getNum_tarjeta() {
		return num_tarjeta;
	}
	public void setNum_tarjeta(int num_tarjeta) {
		this.num_tarjeta = num_tarjeta;
	}


	@Override
	public String toString() {
		return "cliente [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", mayor_edad=" + mayor_edad
				+ ", num_tarjeta=" + num_tarjeta + "]";
	}
	
}
