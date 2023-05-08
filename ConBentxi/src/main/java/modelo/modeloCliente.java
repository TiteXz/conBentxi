package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import clases.Cliente;

public class modeloCliente extends Conexion{
	
	public void ainadirUsuario(Cliente cliente) {
		try {
			
			PreparedStatement pst = conexion.prepareStatement("INSERT INTO clientes (dni, nombre, apellido, mayor_edad, num_tarjeta) VALUES(?,?,?,?,?)");
			pst.setString(1, cliente.getDni());
			pst.setString(2, cliente.getNombre());
			pst.setString(3, cliente.getApellido());
			pst.setBoolean(4, cliente.isMayor_edad());
			pst.setInt(5, cliente.getNum_tarjeta());

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}
