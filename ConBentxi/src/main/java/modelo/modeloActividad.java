package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

import clases.Actividad;

public class modeloActividad extends Conexion{

	public void ainadirActividad(Actividad actividad) {
		try {
			PreparedStatement pst = conexion.prepareStatement("INSERT INTO actividades (nombre, fecha_ini, fecha_fin, descripcion, id_empleado) VALUES (?,?,?,?,?)");
			
			pst.setString(1, actividad.getNombre());
			pst.setDate(2, new Date(actividad.getFecha_ini().getTime()));
			pst.setDate(3, new Date(actividad.getFecha_fin().getTime()));
			pst.setString(4, actividad.getDescripcion());
			pst.setInt(5, actividad.getId_empleado());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void eliminarActividad(int id_actividad) {
		try {
			PreparedStatement pst = conexion.prepareStatement("DELETE FROM actividades WHERE id_actividad = ?");
			
			pst.setInt(1, id_actividad);
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void modificarActividad(Actividad actividad) {
		try {
			PreparedStatement pst = conexion.prepareStatement("UPDATE actividades SET nombre=?, fecha_ini=?, fecha_fin=?, descripcion=?, id_empleado=? WHERE id_actividad=?");
			
			pst.setString(1, actividad.getNombre());
			pst.setDate(2, new Date(actividad.getFecha_ini().getTime()));
			pst.setDate(3, new Date(actividad.getFecha_fin().getTime()));
			pst.setString(4, actividad.getDescripcion());
			pst.setInt(5, actividad.getId_empleado());
			pst.setInt(6, actividad.getId_actividad());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Actividad> getActividades(){
		ArrayList<Actividad> actividades = new ArrayList<Actividad>();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM actividades");
			
			ResultSet resultado = pst.executeQuery();
			
			while (resultado.next()) {
				Actividad actividad = new Actividad();
				
				actividad.setId_actividad(resultado.getInt("id_actividad"));
				actividad.setNombre(resultado.getString("nombre"));
				actividad.setFecha_ini(resultado.getDate("fecha_ini"));
				actividad.setFecha_fin(resultado.getDate("fecha_fin"));
				actividad.setDescripcion(resultado.getString("descripcion"));
				actividad.setId_empleado(resultado.getInt("id_empleado"));
				
				actividades.add(actividad);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return actividades;
	}

	public Actividad getActividad(int id_actividad) {
		Actividad actividad = new Actividad();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM actividades WHERE id_actividad = ?");
			
			pst.setInt(1, id_actividad);
			
			ResultSet resultado = pst.executeQuery();
			
			resultado.next();
			
			actividad.setId_actividad(resultado.getInt("id_actividad"));
			actividad.setNombre(resultado.getString("nombre"));
			actividad.setFecha_ini(resultado.getDate("fecha_ini"));
			actividad.setFecha_fin(resultado.getDate("fecha_fin"));
			actividad.setDescripcion(resultado.getString("descripcion"));
			actividad.setId_empleado(resultado.getInt("id_empleado"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return actividad;
	}
}
