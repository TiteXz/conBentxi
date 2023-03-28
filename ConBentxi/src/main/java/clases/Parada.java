package clases;

import java.util.Date;

public class Parada {

	private int id_parada;
	private String ciudad;
	private String pais;
	private Date tiempo_quieto;
	private String descripcion;
	
	public Parada() {}

	public Parada(int id_parada, String ciudad, String pais, Date tiempo_quieto, String descripcion) {
		super();
		this.id_parada = id_parada;
		this.ciudad = ciudad;
		this.pais = pais;
		this.tiempo_quieto = tiempo_quieto;
		this.descripcion = descripcion;
	}

	public int getId_parada() {
		return id_parada;
	}

	public void setId_parada(int id_parada) {
		this.id_parada = id_parada;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Date getTiempo_quieto() {
		return tiempo_quieto;
	}

	public void setTiempo_quieto(Date tiempo_quieto) {
		this.tiempo_quieto = tiempo_quieto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "parada [id_parada=" + id_parada + ", ciudad=" + ciudad + ", pais=" + pais + ", tiempo_quieto="
				+ tiempo_quieto + ", descripcion=" + descripcion + "]";
	}
	
	
	
	
	
}
