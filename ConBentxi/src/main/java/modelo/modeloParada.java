package modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Parada;

public class modeloParada extends Conexion{

	public void ainadirParada(Parada parada) {
		try {
			PreparedStatement pst = conexion.prepareStatement("INSERT INTO paradas (ciudad, pais, tiempo_estacionamiento, fecha_salida, fecha_llegada) VALUES (?, ?, ?, ?, ?)");
			
			pst.setString(1, parada.getCiudad());
			pst.setString(2, parada.getPais());
			pst.setInt(3, parada.getTiempo_estacionamiento());
			pst.setDate(4, new Date(parada.getFecha_salida().getTime()));
			pst.setDate(5, new Date(parada.getFecha_llegada().getTime()));
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void eliminarParada(int id_parada) {
		try {
			PreparedStatement pst = conexion.prepareStatement("DELETE FROM paradas WHERE id_parada = ?");
			
			pst.setInt(1, id_parada);
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void modificarParada(Parada parada) {
		try {
			PreparedStatement pst = conexion.prepareStatement("UPDATE paradas SET ciudad = ?, pais = ?, tiempo_estacionamiento = ?, fecha_salida = ?, fecha_llegada = ? WHERE id_parada = ?");
			
			pst.setString(1, parada.getCiudad());
			pst.setString(2, parada.getPais());
			pst.setInt(3, parada.getTiempo_estacionamiento());
			pst.setDate(4, new Date(parada.getFecha_salida().getTime()));
			pst.setDate(5, new Date(parada.getFecha_llegada().getTime()));
			pst.setInt(6, parada.getId_parada());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Parada> getParadas(){
		ArrayList<Parada> paradas = new ArrayList<Parada>();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM paradas");
			
			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()) {
				Parada parada = new Parada();
				
				parada.setId_parada(resultado.getInt("id_parada"));
				parada.setCiudad(resultado.getString("ciudad"));
				parada.setPais(resultado.getString("pais"));
				parada.setTiempo_estacionamiento(resultado.getInt("tiempo_estacionamiento"));
				parada.setFecha_salida(resultado.getDate("fecha_salida"));
				parada.setFecha_llegada(resultado.getDate("fecha_llegada"));
				
				paradas.add(parada);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return paradas;
	}

	public Parada getParada(int id_actividad) {
		Parada parada = new Parada();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM paradas WHERE id_parada = ?");
			
			pst.setInt(1, id_actividad);
			
			ResultSet resultado = pst.executeQuery();
			
			resultado.next();
			
			parada.setId_parada(id_actividad);
			parada.setCiudad(resultado.getString("ciudad"));
			parada.setPais(resultado.getString("pais"));
			parada.setTiempo_estacionamiento(resultado.getInt("tiempo_estacionamiento"));
			parada.setFecha_salida(resultado.getDate("fecha_salida"));
			parada.setFecha_llegada(resultado.getDate("fecha_llegada"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return parada;
	}
}
