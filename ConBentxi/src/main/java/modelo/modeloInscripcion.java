package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Inscripcion;

public class modeloInscripcion extends Conexion{

	public void ainadirInscripcion(Inscripcion inscripcion) {
		try {
			PreparedStatement pst = conexion.prepareStatement("INSERT INTO inscripciones (dni_cliente, id_actividad) VALUES (?, ?)");
			
			pst.setString(1, inscripcion.getDni_cliente());
			pst.setInt(2, inscripcion.getId_actividad());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void eliminarInscripcion(String dni_cliente, int id_actividad) {
		try {
			PreparedStatement pst = conexion.prepareStatement("DELETE FROM inscripciones WHERE dni_cliente = ? AND id_actividad = ?");
			
			pst.setString(1, dni_cliente);
			pst.setInt(2, id_actividad);
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Inscripcion> getInscripciones(){
		ArrayList<Inscripcion> inscripciones = new ArrayList<Inscripcion>();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM inscripciones");
			
			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()) {
				Inscripcion inscripcion = new Inscripcion();
				
				inscripcion.setDni_cliente(resultado.getString("dni_cliente"));
				inscripcion.setId_actividad(resultado.getInt("id_actividad"));
				
				inscripciones.add(inscripcion);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return inscripciones;
	}
}
