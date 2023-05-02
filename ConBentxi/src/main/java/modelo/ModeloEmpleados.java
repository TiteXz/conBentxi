package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import clases.Empleado;

public class ModeloEmpleados extends Conexion{

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
			
			e.printStackTrace();
		}
		
		return empleados;
		
	}
	
public ArrayList<Empleado> getUsuariosPassword(){
		
	ArrayList<Empleado> empleados = new ArrayList<Empleado>();

			PreparedStatement pst;
			try {
				pst = getConexion().prepareStatement("SELECT usuario, password FROM empleados");
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

}
