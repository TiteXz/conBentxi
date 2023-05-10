package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

import clases.Cliente;

public class modeloCliente extends Conexion{

	public ArrayList<Cliente> getClientes(){
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM clientes");
			
			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()) {
				Cliente cliente = new Cliente();
				
				cliente.setDni(resultado.getString("dni"));
				cliente.setNombre(resultado.getString("nombre"));
				cliente.setApellido(resultado.getString("apellido"));
				cliente.setMayor_edad(resultado.getBoolean("mayor_edad"));
				cliente.setNum_tarjeta(resultado.getInt("num_tarjeta"));
				
				clientes.add(cliente);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return clientes;
	}

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

	public void eliminarUsuarios(String dni) {

		try {
			PreparedStatement pst = conexion.prepareStatement("DELETE FROM clientes WHERE dni = ?");
			pst.setString(1, dni);

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Cliente getCliente(String dni) {
		Cliente cliente = new Cliente();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM clientes WHERE dni = ?");
			
			pst.setString(1, dni);
			
			ResultSet resultado = pst.executeQuery();
			
			resultado.next();
			
			cliente.setDni(resultado.getString("dni"));
			cliente.setNombre(resultado.getString("nombre"));
			cliente.setApellido(resultado.getString("apellido"));
			cliente.setMayor_edad(resultado.getBoolean("mayor_edad"));
			cliente.setNum_tarjeta(resultado.getInt("num_tarjeta"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cliente;
	}

	public void modificarCliente(Cliente cliente) {
		try {
			PreparedStatement pst = conexion.prepareStatement("UPDATE clientes SET nombre = ?, apellido = ?, mayor_edad = ?, num_tarjeta = ? WHERE dni = ?");
			
			pst.setString(1, cliente.getNombre());
			pst.setString(2, cliente.getApellido());
			pst.setBoolean(3, cliente.isMayor_edad());
			pst.setInt(4, cliente.getNum_tarjeta());
			pst.setString(5, cliente.getDni());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}