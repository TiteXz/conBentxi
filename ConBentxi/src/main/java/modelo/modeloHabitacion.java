package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Habitacion;

public class modeloHabitacion extends Conexion {

	public ArrayList<Habitacion> getHabitaciones(){
		 ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT FROM habitaciones");
			
			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()) {
				Habitacion habita = new Habitacion();
				
				habita.setNumero_habita(resultado.getInt("numero_habita"));
				habita.setDescripcion(resultado.getString("descripcion"));
				habita.setPrecio(resultado.getDouble("precio"));
				habita.setId_crucero(resultado.getInt("id_crucero"));
				habita.setId_empleado(resultado.getInt("id_empleado"));
				habita.setImagen(resultado.getString("imagen"));
				
				habitaciones.add(habita);
				
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return habitaciones;
		
	}
	
	public ArrayList<Habitacion> getHabitacionesCrucero(int id_crucero){
		 ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM habitaciones WHERE id_crucero = ?");
			pst.setInt(1, id_crucero);
			
			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()) {
				Habitacion habita = new Habitacion();
				
				
				habita.setNumero_habita(resultado.getInt("numero_habitacion"));
				habita.setDescripcion(resultado.getString("descripcion"));
				habita.setPrecio(resultado.getDouble("precio"));
				habita.setId_crucero(resultado.getInt("id_crucero"));
				habita.setId_empleado(resultado.getInt("id_empleado"));
				habita.setImagen(resultado.getString("imagen"));
				
				habitaciones.add(habita);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return habitaciones;
		
	}
	
}
