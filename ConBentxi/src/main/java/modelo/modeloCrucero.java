package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Crucero;

public class modeloCrucero extends Conexion{

	public ArrayList<Crucero> getCruceros(){
		ArrayList<Crucero> cruceros = new ArrayList<Crucero>();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM cruceros");
			
			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()) {
				Crucero crucero = new Crucero();
				
				crucero.setId_crucero(resultado.getInt("id_crucero"));
				crucero.setNombre(resultado.getString("nombre"));
				crucero.setCapitan(resultado.getString("capitan"));
				crucero.setCategoria(resultado.getString("categoria"));
				crucero.setId_ruta(resultado.getInt("id_ruta"));
				
				cruceros.add(crucero);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cruceros;
		
	}
	
}
