package clases;

public class Crucero_actividad {

	private int id_crucero;
	private int id_actividad;
	
	public Crucero_actividad() {
		super();
	}

	public Crucero_actividad(int id_crucero, int id_actividad) {
		super();
		this.id_crucero = id_crucero;
		this.id_actividad = id_actividad;
	}

	public int getId_crucero() {
		return id_crucero;
	}

	public void setId_crucero(int id_crucero) {
		this.id_crucero = id_crucero;
	}

	public int getId_actividad() {
		return id_actividad;
	}

	public void setId_actividad(int id_actividad) {
		this.id_actividad = id_actividad;
	}

	@Override
	public String toString() {
		return "Crucero_actividade [id_crucero=" + id_crucero + ", id_actividad=" + id_actividad + "]";
	}
}
