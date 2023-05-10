package clases;

import java.util.Date;

public class Reserva {

	private int id_crucero;
	private String dni_cliente;
	private Date fecha_ini;
	private Date fecha_fin;
	
	
	public Reserva() {}


	public Reserva(int id_crucero, String dni_cliente, Date fecha_ini, Date fecha_fin) {
		super();
		this.id_crucero = id_crucero;
		this.dni_cliente = dni_cliente;
		this.fecha_ini = fecha_ini;
		this.fecha_fin = fecha_fin;
	}


	public int getId_crucero() {
		return id_crucero;
	}


	public void setId_crucero(int id_crucero) {
		this.id_crucero = id_crucero;
	}


	public String getDni_cliente() {
		return dni_cliente;
	}


	public void setDni_cliente(String dni_cliente) {
		this.dni_cliente = dni_cliente;
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


	@Override
	public String toString() {
		return "reservas [id_crucero=" + id_crucero + ", dni_cliente=" + dni_cliente + ", fecha_ini=" + fecha_ini
				+ ", fecha_fin=" + fecha_fin + "]";
	}
	
	
	
	
	
}
