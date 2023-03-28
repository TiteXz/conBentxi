package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



//public class Conexion {
//	
//	
//
//	protected  Connection conexion;
//	
//	public void Conectar() {
//		
//	String url = "jdbc:oracle:thin:@"+ParametrosConexion.HOST+":"+ParametrosConexion.PORT+":xe";
//	
//	Properties props = new Properties();
//
//	props.setProperty("user", ParametrosConexion.USERNAME);
//
//	props.setProperty("password", ParametrosConexion.PASSWORD);
//
//	// creating connection to Oracle database
//
//	conexion = DriverManager.getConnection(url, props);
//
//	statement = conexion.createStatement();
//
//	System.out.println("Se ha conectado a la BBDD-Oracle satisfactoriamente");
//	
//	}
//}


public class Conexion {
	
	protected  Connection conexion;

	/**
	 */
	public void Conectar() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				this.conexion = DriverManager.getConnection("jdbc:mysql://" + ParametrosConexion.HOST + "/" + ParametrosConexion.BBDD, ParametrosConexion.USERNAME, ParametrosConexion.PASSWORD);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
	}
	
	public void cerrar() {
		
		try {
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
}