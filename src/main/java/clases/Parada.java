package clases;

import java.util.Date;

public class Parada {

	private int id_parada;
	private String ciudad;
	private String pais;
	private int tiempo_estacionamiento;
	private Date fecha_salida;
	private Date fecha_llegada;
	
	public Parada() {}

	public Parada(int id_parada, String ciudad, String pais, int tiempo_estacionamiento, Date fecha_salida, Date fecha_llegada) {
		super();
		this.id_parada = id_parada;
		this.ciudad = ciudad;
		this.pais = pais;
		this.tiempo_estacionamiento = tiempo_estacionamiento;
		this.setFecha_salida(fecha_salida);
		this.setFecha_llegada(fecha_llegada);
		
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

	public int getTiempo_estacionamiento() {
		return tiempo_estacionamiento;
	}

	public void setTiempo_estacionamiento(int tiempo_estacionamiento) {
		this.tiempo_estacionamiento = tiempo_estacionamiento;
	}

	public Date getFecha_salida() {
		return fecha_salida;
	}

	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}

	public Date getFecha_llegada() {
		return fecha_llegada;
	}

	public void setFecha_llegada(Date fecha_llegada) {
		this.fecha_llegada = fecha_llegada;
	}

	@Override
	public String toString() {
		return "Parada [id_parada=" + id_parada + ", ciudad=" + ciudad + ", pais=" + pais + ", tiempo_estacionamiento="
				+ tiempo_estacionamiento + ", fecha_salida=" + fecha_salida + ", fecha_llegada=" + fecha_llegada + "]";
	}
}
