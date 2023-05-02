package clases;

public class Estacionamiento {

	private int id_crucero;
	private int id_puerto;
	
	public Estacionamiento() {
		super();
	}

	public Estacionamiento(int id_crucero, int id_puerto) {
		super();
		this.id_crucero = id_crucero;
		this.id_puerto = id_puerto;
	}

	public int getId_crucero() {
		return id_crucero;
	}

	public void setId_crucero(int id_crucero) {
		this.id_crucero = id_crucero;
	}

	public int getId_puerto() {
		return id_puerto;
	}

	public void setId_puerto(int id_puerto) {
		this.id_puerto = id_puerto;
	}

	@Override
	public String toString() {
		return "Estacionamiento [id_crucero=" + id_crucero + ", id_puerto=" + id_puerto + "]";
	}
}