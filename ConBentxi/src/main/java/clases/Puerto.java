package clases;

public class Puerto {

	private int id_puerto;
	private String pais;
	private String ciudad;
	private int amarre;
	
	public Puerto() {}

	public Puerto(int id_puerto, String pais, String ciudad, int amarre) {
		super();
		this.id_puerto = id_puerto;
		this.pais = pais;
		this.ciudad = ciudad;
		this.amarre = amarre;
	}

	public int getId_puerto() {
		return id_puerto;
	}

	public void setId_puerto(int id_puerto) {
		this.id_puerto = id_puerto;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getAmarre() {
		return amarre;
	}

	public void setAmarre(int amarre) {
		this.amarre = amarre;
	}

	@Override
	public String toString() {
		return "puerto [id_puerto=" + id_puerto + ", pais=" + pais + ", ciudad=" + ciudad + ", amarre=" + amarre + "]";
	}
	
	
	
	
}
