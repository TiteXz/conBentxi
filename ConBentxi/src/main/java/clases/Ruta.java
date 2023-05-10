package clases;

import java.util.Date;

public class Ruta {

	private int id_ruta;
	private Date fecha_ini;
	private Date fecha_fin;
	private String origen;
	private String destino;
	
	public Ruta() {
		super();
	}

	public Ruta(int id_ruta, Date fecha_ini, Date fecha_fin, String origen, String destino) {
		super();
		this.id_ruta = id_ruta;
		this.fecha_ini = fecha_ini;
		this.fecha_fin = fecha_fin;
		this.origen = origen;
		this.destino = destino;
	}

	public int getId_ruta() {
		return id_ruta;
	}

	public void setId_ruta(int id_ruta) {
		this.id_ruta = id_ruta;
	}

	public Date getFecha_ini() {
		return fecha_ini;
	}

	public void setFecha_ini(Date fecha_ini) {
		this.fecha_ini = fecha_ini;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "Ruta [id_ruta=" + id_ruta + ", fecha_ini=" + fecha_ini + ", fecha_fin=" + fecha_fin + ", origen="
				+ origen + ", destino=" + destino + "]";
	}
}
