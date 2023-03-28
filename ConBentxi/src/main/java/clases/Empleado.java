package clases;

public class Empleado {

	private int id_empleado;
	private String nombre;
	private String apellido;
	private String trabajo;
	private int id_crucero;
	
	public Empleado() {}

	public Empleado(int id_empleado, String nombre, String apellido, String trabajo, int id_crucero) {
		super();
		this.id_empleado = id_empleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.trabajo = trabajo;
		this.id_crucero = id_crucero;
	}

	public int getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
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

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public int getId_crucero() {
		return id_crucero;
	}

	public void setId_crucero(int id_crucero) {
		this.id_crucero = id_crucero;
	}

	@Override
	public String toString() {
		return "empleado [id_empleado=" + id_empleado + ", nombre=" + nombre + ", apellido=" + apellido + ", trabajo="
				+ trabajo + ", id_crucero=" + id_crucero + "]";
	}
	
	

}
