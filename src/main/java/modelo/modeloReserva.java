package modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Reserva;

/**
 * 
 * @author benat
 *
 */
public class modeloReserva extends Conexion{

	/**
	 * 
	 * @param reserva para insertar una reserva
	 */
	public void ainadirReserva(Reserva reserva) {
		try {
			PreparedStatement pst = conexion.prepareStatement("INSERT INTO reservas (dni_cliente, id_crucero, fecha_ini, fecha_fin, numero_habitacion) VALUES (?, ?, ?, ?, ?)");
			
			pst.setString(1, reserva.getDni_cliente());
			pst.setInt(2, reserva.getId_crucero());
			pst.setDate(3, new Date(reserva.getFecha_ini().getTime()));
			pst.setDate(4, new Date(reserva.getFecha_fin().getTime()));
			pst.setInt(5, reserva.getNumero_habitacion());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param dni_cliente junto a una id y un numero para eliminar una reserva de la BBDD
	 * @param id_crucero junto a un numero y un dni para eliminar una reserva de la BBDD
	 * @param numero_habitacion junto a un dni y un id para eliminar una reserva de la BBDD
	 */
	public void eliminarReserva(String dni_cliente, int id_crucero, int numero_habitacion) {
		try {
			PreparedStatement pst = conexion.prepareStatement("DELETE FROM reservas WHERE dni_cliente = ? AND id_crucero = ? AND numero_habitacion = ?");
			
			pst.setString(1, dni_cliente);
			pst.setInt(2, id_crucero);
			pst.setInt(3, numero_habitacion);
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @return una lista de todas las reservas
	 */
	public ArrayList<Reserva> getReservas(){
		ArrayList<Reserva> reservas = new ArrayList<Reserva>();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM reservas");
			
			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()) {
				Reserva reserva = new Reserva();
				reserva.setDni_cliente(resultado.getString("dni_cliente"));
				reserva.setId_crucero(resultado.getInt("id_crucero"));
				reserva.setFecha_ini(resultado.getDate("fecha_ini"));
				reserva.setFecha_fin(resultado.getDate("fecha_fin"));
				reserva.setNumero_habitacion(resultado.getInt("numero_habitacion"));
				
				reservas.add(reserva);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return reservas;
	}
}
