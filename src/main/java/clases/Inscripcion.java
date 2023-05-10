package clases;

public class Inscripcion {

	private String dni_cliente;
	private int id_actividad;
	
	public Inscripcion() {
		super();
	}

	public Inscripcion(String dni_cliente, int id_actividad) {
		super();
		this.dni_cliente = dni_cliente;
		this.id_actividad = id_actividad;
	}

	public String getDni_cliente() {
		return dni_cliente;
	}

	public void setDni_cliente(String dni_cliente) {
		this.dni_cliente = dni_cliente;
	}

	public int getId_actividad() {
		return id_actividad;
	}

	public void setId_actividad(int id_actividad) {
		this.id_actividad = id_actividad;
	}

	@Override
	public String toString() {
		return "Inscripciones [dni_cliente=" + dni_cliente + ", id_actividad=" + id_actividad + "]";
	}
}
