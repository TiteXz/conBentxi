package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Estacionamiento;

public class modeloEstacionamiento extends Conexion{

	public ArrayList<Estacionamiento> getEstacionamientos() {
		ArrayList<Estacionamiento> estacionamientos = new ArrayList<Estacionamiento>();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM estacionamientos");
			
			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()) {
				Estacionamiento estacionamiento = new Estacionamiento();
				
				estacionamiento.setId_crucero(resultado.getInt("id_crucero"));
				estacionamiento.setId_puerto(resultado.getInt("id_puerto"));
				
				estacionamientos.add(estacionamiento);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return estacionamientos;
	}
	
	public void ainadirEstacionamiento(Estacionamiento estacionamiento) {
		try {
			PreparedStatement pst = conexion.prepareStatement("INSERT INTO estacionamientos (id_crucero, id_puerto) VALUES (?, ?)");
			
			pst.setInt(1, estacionamiento.getId_crucero());
			pst.setInt(2, estacionamiento.getId_puerto());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void eliminarEstacionamiento(Estacionamiento estacionamiento) {
		try {
			PreparedStatement pst = conexion.prepareStatement("DELETE FROM estacionamientos WHERE id_crucero = ? AND id_puerto = ?");
			
			pst.setInt(1, estacionamiento.getId_crucero());
			pst.setInt(2, estacionamiento.getId_puerto());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}