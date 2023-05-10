package clases;

public class Ruta_parada {

	private int id_ruta;
	private int id_parada;
	
	public Ruta_parada() {
		super();
	}

	public Ruta_parada(int id_ruta, int id_parada) {
		super();
		this.id_ruta = id_ruta;
		this.id_parada = id_parada;
	}

	public int getId_ruta() {
		return id_ruta;
	}

	public void setId_ruta(int id_ruta) {
		this.id_ruta = id_ruta;
	}

	public int getId_parada() {
		return id_parada;
	}

	public void setId_parada(int id_parada) {
		this.id_parada = id_parada;
	}

	@Override
	public String toString() {
		return "Ruta_parada [id_ruta=" + id_ruta + ", id_parada=" + id_parada + "]";
	}
}
