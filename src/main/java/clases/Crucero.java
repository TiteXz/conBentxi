package clases;

public class Crucero {

	private int id_crucero;
	private String nombre;
	private String capitan;
	private String categoria;
	private int id_ruta;
	private String imagen;
	
	public Crucero() {}

	public Crucero(int id_crucero, String nombre, String capitan, String categoria, int id_ruta, String imagen) {
		super();
		this.id_crucero = id_crucero;
		this.nombre = nombre;
		this.capitan = capitan;
		this.categoria = categoria;
		this.id_ruta = id_ruta;
		this.setImagen(imagen);
	}

	public int getId_crucero() {
		return id_crucero;
	}

	public void setId_crucero(int id_crucero) {
		this.id_crucero = id_crucero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCapitan() {
		return capitan;
	}

	public void setCapitan(String capitan) {
		this.capitan = capitan;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getId_ruta() {
		return id_ruta;
	}

	public void setId_ruta(int id_ruta) {
		this.id_ruta = id_ruta;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "crucero [id_crucero=" + id_crucero + ", nombre=" + nombre + ", capitan=" + capitan + ", categoria="
				+ categoria + "]";
	}
	
	
	
}
