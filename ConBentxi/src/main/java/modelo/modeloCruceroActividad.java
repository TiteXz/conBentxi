package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.CruceroActividad;

public class modeloCruceroActividad extends Conexion{

	public void ainadirCruceroActividad(CruceroActividad cruceroActividad) {
		try {
			PreparedStatement pst = conexion.prepareStatement("INSERT INTO cruceros_actividades (id_crucero, id_actividad) VALUES (?, ?)");
			
			pst.setInt(1, cruceroActividad.getId_crucero());
			pst.setInt(2, cruceroActividad.getId_actividad());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void eliminarCruceroActividad(CruceroActividad cruceroActividad) {
		try {
			PreparedStatement pst = conexion.prepareStatement("DELETE FROM cruceros_actividades WHERE id_crucero = ? AND id_actividad = ?");
			
			pst.setInt(1, cruceroActividad.getId_crucero());
			pst.setInt(2, cruceroActividad.getId_actividad());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void modificarCruceroActividad(CruceroActividad cruceroActividad) {
		try {
			PreparedStatement pst = conexion.prepareStatement("UPDATE cruceros_actividades SET id_crucero = ?, id_actividad = ? WHERE id_crucero = ? AND id_actividad = ?");
			
			pst.setInt(1, cruceroActividad.getId_crucero());
			pst.setInt(2, cruceroActividad.getId_actividad());
			pst.setInt(3, cruceroActividad.getId_crucero());
			pst.setInt(4, cruceroActividad.getId_actividad());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<CruceroActividad> getCrucerosActividades(){
		ArrayList<CruceroActividad> crucerosActividades = new ArrayList<CruceroActividad>();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM cruceros_actividades");
			
			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()) {
				CruceroActividad cruceroActividad = new CruceroActividad();
				
				cruceroActividad.setId_crucero(resultado.getInt("id_crucero"));
				cruceroActividad.setId_actividad(resultado.getInt("id_actividad"));
				
				crucerosActividades.add(cruceroActividad);	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return crucerosActividades;
	}
}