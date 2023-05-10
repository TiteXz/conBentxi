package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Puerto;

/**
 * 
 * @author benat
 *
 */
public class modeloPuerto extends Conexion{

	/**
	 * 
	 * @param puerto para insertar un puerto en la BBDD
	 */
	public void ainadirPuerto(Puerto puerto) {
		try {
			PreparedStatement pst = conexion.prepareStatement("INSERT INTO puertos (pais, ciudad, amarre) VALUES (?, ?, ?)");
			
			pst.setString(1, puerto.getPais());
			pst.setString(2, puerto.getCiudad());
			pst.setInt(3, puerto.getAmarre());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param id_puerto para eliminar un puerto de la BBDD
	 */
	public void eliminarPuerto(int id_puerto) {
		try {
			PreparedStatement pst = conexion.prepareStatement("DELETE FROM puertos WHERE id_puerto = ?");
			
			pst.setInt(1, id_puerto);
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param puerto con datos nuevos para modificar un puerto
	 */
	public void modificarPuerto(Puerto puerto) {
		try {
			PreparedStatement pst = conexion.prepareStatement("UPDATE puertos SET pais=?, ciudad=?, amarre=? WHERE id_puerto=?");
			
			pst.setString(1, puerto.getPais());
			pst.setString(2, puerto.getCiudad());
			pst.setInt(3, puerto.getAmarre());
			pst.setInt(4, puerto.getId_puerto());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @return una lista de todos los puertos
	 */
	public ArrayList<Puerto> getPuertos(){
		ArrayList<Puerto> puertos = new ArrayList<Puerto>();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM puertos");
			
			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()) {
				Puerto puerto = new Puerto();
				
				puerto.setId_puerto(resultado.getInt("id_puerto"));
				puerto.setPais(resultado.getString("pais"));
				puerto.setCiudad(resultado.getString("ciudad"));
				puerto.setAmarre(resultado.getInt("amarre"));
				
				puertos.add(puerto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return puertos;
	}

	/**
	 * 
	 * @param id_puerto para seleccionar un puerto
	 * @return el puerto seleccionado
	 */
	public Puerto getPuerto(int id_puerto) {
		Puerto puerto = new Puerto();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM puertos WHERE id_puerto = ?");
			
			pst.setInt(1, id_puerto);
			
			ResultSet resultado = pst.executeQuery();
			
			resultado.next();
			
			puerto.setId_puerto(id_puerto);
			puerto.setPais(resultado.getString("pais"));
			puerto.setCiudad(resultado.getString("ciudad"));
			puerto.setAmarre(resultado.getInt("amarre"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return puerto;
	}
}
