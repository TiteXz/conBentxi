package clases;

public class Habitacion {
	private int numero_habitacion;
	private String	descripcion; 
	private double precio;
	private int id_crucero; 
	private int id_empleado;
	private String imagen;
	private String dni_cliente;
	
	
	public Habitacion() {}

	public Habitacion(int numero_habita, String descripcion, double precio, int id_crucero, int id_empleado, String imagen, String dni_cliente) {
		super();
		this.numero_habitacion = numero_habita;
		this.descripcion = descripcion;
		this.precio = precio;
		this.id_crucero = id_crucero;
		this.id_empleado = id_empleado;
		this.imagen = imagen;
		this.dni_cliente = dni_cliente;
		
	}

	public int getNumero_habitacion() {
		return numero_habitacion;
	}

	public void setNumero_habitacion(int numero_habitacion) {
		this.numero_habitacion = numero_habitacion;
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

	public String getDni_cliente() {
		return dni_cliente;
	}

	public void setDni_cliente(String dni_cliente) {
		this.dni_cliente = dni_cliente;
	}
}
