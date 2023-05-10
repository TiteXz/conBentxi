package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Empleado;

/**
 * 
 * @author benat
 *
 */
public class modeloEmpleado extends Conexion{

	/**
	 * 
	 * @param empleado para insertarlo en la BBDD
	 */
	public void ainadirEmpleado(Empleado empleado) {
		try {
			PreparedStatement pst = conexion.prepareStatement("INSERT INTO empleados (nombre, apellido, trabajo, id_crucero, usuario, password) VALUES (?,?,?,?,?,?)");
			
			pst.setString(1, empleado.getNombre());
			pst.setString(2, empleado.getApellido());
			pst.setString(3, empleado.getTrabajo());
			pst.setInt(4, empleado.getId_crucero());
			pst.setString(5, empleado.getUsuario());
			pst.setString(6, empleado.getPassword());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param id_empleado para eliminar un empleado de la BBDD
	 */
	public void eliminarEmpleado(int id_empleado) {
		try {
			PreparedStatement pst = conexion.prepareStatement("DELETE FROM empleados WHERE id_empleado = ?");
			
			pst.setInt(1, id_empleado);
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param empleado con nuevos datos para modificar un empleado
	 */
	public void modificarEmpleado(Empleado empleado) {
		try {
			PreparedStatement pst = conexion.prepareStatement("UPDATE empleados SET nombre=?, apellido=?, trabajo=?, id_crucero=?, usuario=?, password=? WHERE id_empleado=?");
			
			pst.setString(1, empleado.getNombre());
			pst.setString(2, empleado.getApellido());
			pst.setString(3, empleado.getTrabajo());
			pst.setInt(4, empleado.getId_crucero());
			pst.setString(5, empleado.getUsuario());
			pst.setString(6, empleado.getPassword());
			pst.setInt(7, empleado.getId_empleado());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @return una lista de todos los empleados
	 */
	public ArrayList<Empleado> getEmpleados(){
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM empleados");
			
			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()) {
				Empleado empleado = new Empleado();
				
				empleado.setId_empleado(resultado.getInt("id_empleado"));
				empleado.setNombre(resultado.getString("nombre"));
				empleado.setApellido(resultado.getString("apellido"));
				empleado.setTrabajo(resultado.getString("trabajo"));
				empleado.setId_crucero(resultado.getInt("id_crucero"));
				empleado.setUsuario(resultado.getString("usuario"));
				empleado.setPassword(resultado.getString("password"));
				
				empleados.add(empleado);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return empleados;
	}
	
	/**
	 * 
	 * @return una lista de los usuarios y las contraseñas de todos los empleados
	 */
	public ArrayList<Empleado> getUsuariosPassword(){
        
	    ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	            PreparedStatement pst;
	            try {
	                pst = conexion.prepareStatement("Select usuario, password from empleados");
	                ResultSet resultado = pst.executeQuery();
	                
	                while(resultado.next()) {
	                    Empleado empleado = new Empleado();
	                    empleado.setUsuario(resultado.getString("usuario"));
	                    empleado.setPassword(resultado.getString("password"));
	                    
	                    empleados.add(empleado);
	                    
	                }    
	            } catch (SQLException e) {
	                
	                e.printStackTrace();
	            }
	            
	            
	        
	        return empleados;
	}

	/**
	 * 
	 * @param id_empleado para seleccionar un empleado
	 * @return el empleado seleccionado
	 */
	public Empleado getEmpleado(int id_empleado) {
		Empleado empleado = new Empleado();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM empleados WHERE id_empleado = ?");
			
			pst.setInt(1, id_empleado);
			
			ResultSet resultado = pst.executeQuery();
			
			resultado.next();
			
			empleado.setId_empleado(id_empleado);
			empleado.setNombre(resultado.getString("nombre"));
			empleado.setApellido(resultado.getString("apellido"));
			empleado.setTrabajo(resultado.getString("trabajo"));
			empleado.setId_crucero(resultado.getInt("id_crucero"));
			empleado.setUsuario(resultado.getString("usuario"));
			empleado.setPassword(resultado.getString("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return empleado;
	}
}
