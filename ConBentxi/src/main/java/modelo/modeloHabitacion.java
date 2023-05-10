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
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM habitaciones");
			
			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()) {
				Habitacion habita = new Habitacion();
				
				habita.setNumero_habitacion(resultado.getInt("numero_habitacion"));
				habita.setDescripcion(resultado.getString("descripcion"));
				habita.setPrecio(resultado.getDouble("precio"));
				habita.setId_crucero(resultado.getInt("id_crucero"));
				habita.setId_empleado(resultado.getInt("id_empleado"));
				habita.setImagen(resultado.getString("imagen"));
				habita.setDni_cliente(resultado.getString("dni_cliente"));
				
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
				
				
				habita.setNumero_habitacion(resultado.getInt("numero_habitacion"));
				habita.setDescripcion(resultado.getString("descripcion"));
				habita.setPrecio(resultado.getDouble("precio"));
				habita.setId_crucero(resultado.getInt("id_crucero"));
				habita.setId_empleado(resultado.getInt("id_empleado"));
				habita.setImagen(resultado.getString("imagen"));
				habita.setDni_cliente(resultado.getString("dni_cliente"));
				
				habitaciones.add(habita);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return habitaciones;
		
	}
	
	public void ainadirHabitacion(Habitacion habitacion) {
		try {
			PreparedStatement pst = conexion.prepareStatement("INSERT INTO habitaciones (descripcion, precio, id_crucero, id_empleado, imagen, dni_cliente) VALUES (?, ?, ?, ?, ?, ?)");
			
			pst.setString(1, habitacion.getDescripcion());
			pst.setDouble(2, habitacion.getPrecio());
			pst.setInt(3, habitacion.getId_crucero());
			pst.setInt(4, habitacion.getId_empleado());
			pst.setString(5, habitacion.getImagen());
			pst.setString(6, habitacion.getDni_cliente());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void eliminarHabitacion(int numero_habitacion) {
		try {
			PreparedStatement pst = conexion.prepareStatement("DELETE FROM habitaciones WHERE numero_habitacion = ?");
			
			pst.setInt(1, numero_habitacion);
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void modificarHabitacion(Habitacion habitacion) {
		try {
			PreparedStatement pst = conexion.prepareStatement("UPDATE habitaciones SET descripcion = ?, precio = ?, id_crucero = ?, id_empleado = ?, imagen = ?, dni_cliente = ? WHERE numero_habitacion = ?");
			
			pst.setString(1, habitacion.getDescripcion());
			pst.setDouble(2, habitacion.getPrecio());
			pst.setInt(3, habitacion.getId_crucero());
			pst.setInt(4, habitacion.getId_empleado());
			pst.setString(5, habitacion.getImagen());
			pst.setString(6, habitacion.getDni_cliente());
			pst.setInt(7, habitacion.getNumero_habitacion());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Habitacion getHabitacion(int numero_habitacion) {
		Habitacion habitacion = new Habitacion();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM habitaciones WHERE numero_habitacion = ?");
			
			pst.setInt(1, numero_habitacion);
			
			ResultSet resultado = pst.executeQuery();
			
			resultado.next();
			
			habitacion.setNumero_habitacion(numero_habitacion);
			habitacion.setDescripcion(resultado.getString("descripcion"));
			habitacion.setPrecio(resultado.getDouble("precio"));
			habitacion.setId_crucero(resultado.getInt("id_crucero"));
			habitacion.setId_empleado(resultado.getInt("id_empleado"));
			habitacion.setImagen(resultado.getString("imagen"));
			habitacion.setDni_cliente(resultado.getString("dni_cliente"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return habitacion;
	}
	

	public Habitacion getHabitacionMasBarata(int id_crucero) {
		Habitacion habitacion = new Habitacion();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM HABITACIONES WHERE id_crucero = ? ORDER BY precio ASC LIMIT 1");
			
			pst.setInt(1, id_crucero);
			
			ResultSet resultado = pst.executeQuery();
			
			resultado.next();
			
			habitacion.setPrecio(resultado.getDouble("precio"));
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return habitacion;
	}
	
}
