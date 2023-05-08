package clases;

public class Habitacion {
	private int numero_habita;
	private String	descripcion; 
	private double precio;
	private int id_crucero;
	private int id_empleado;
	private String imagen;
	
	
	public Habitacion() {}

	public Habitacion(int numero_habita, String descripcion, double precio, int id_crucero,
			int id_empleado, String imagen) {
		super();
		this.numero_habita = numero_habita;
		this.descripcion = descripcion;
		this.precio = precio;
		this.id_crucero = id_crucero;
		this.id_empleado = id_empleado;
		this.imagen = imagen;
	}

	public int getNumero_habita() {
		return numero_habita;
	}

	public void setNumero_habita(int numero_habita) {
		this.numero_habita = numero_habita;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getId_crucero() {
		return id_crucero;
	}

	public void setId_crucero(int id_crucero) {
		this.id_crucero = id_crucero;
	}

	public int getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}
	
	public String getImagen() {
		return imagen;
	}
	
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
}
