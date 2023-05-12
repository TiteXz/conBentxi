package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Crucero;

/**
 * 
 * @author benat
 *
 */
public class modeloCrucero extends Conexion{

	/**
	 * 
	 * @return una lista de todos los cruceros
	 */
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
				crucero.setImagen(resultado.getString("imagen"));
				
				cruceros.add(crucero);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cruceros;
		
	}

	/**
	 * 
	 * @param id para seleccionar un crucero
	 * @return el crucero seleccionado
	 */
	public Crucero getCrucero(int id) {
		Crucero crucero = new Crucero();

		PreparedStatement pst;
		try {
			pst = conexion.prepareStatement("SELECT * FROM cruceros WHERE id_crucero=?");
			
			pst.setInt(1, id);
			ResultSet resultado = pst.executeQuery();

			resultado.next();
			crucero.setId_crucero(resultado.getInt("id_crucero"));
			crucero.setNombre(resultado.getString("nombre"));
			crucero.setCapitan(resultado.getString("capitan"));
			crucero.setCategoria(resultado.getString("categoria"));
			crucero.setId_ruta(resultado.getInt("id_ruta"));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return crucero;
	}
	
	/**
	 * 
	 * @param id_ruta para seleccionar los cruceros con esa ruta
	 * @return devuelve la id de los cruceros seleccionados
	 */
	public int getId_Crucero(int id_ruta) {
		PreparedStatement pst;
		
		try {
			pst = conexion.prepareStatement("SELECT * FROM cruceros WHERE id_ruta = ?");
		pst.setInt(1, id_ruta);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return id_ruta;
		
		
	}
	
	/**
	 * 
	 * @param crucero para insertarlo en la BBDD
	 */
	public void ainadirCrucero(Crucero crucero) {
		try {
			PreparedStatement pst = conexion.prepareStatement("INSERT INTO cruceros (nombre, capitan, categoria, id_ruta) VALUES(?,?,?,?)");
			pst.setString(1, crucero.getNombre());
			pst.setString(2, crucero.getCapitan());
			pst.setString(3, crucero.getCategoria());
			pst.setInt(4, crucero.getId_ruta());

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param id_crucero para eliminar un crucero de la BBDD
	 */
	public void eliminarCruceros(int id_crucero) {
		
		try {
			PreparedStatement pst = conexion.prepareStatement("DELETE FROM cruceros WHERE id_crucero = ?");
			pst.setInt(1, id_crucero);

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param crucero con datos nuevos para modificar un crucero
	 */
	public void modificarCrucero (Crucero crucero) {
		try {
			PreparedStatement pst = conexion.prepareStatement("UPDATE cruceros SET nombre=?, capitan=?, categoria=?, id_ruta=? WHERE id_crucero=?");
			
			pst.setString(1, crucero.getNombre());
			pst.setString(2, crucero.getCapitan());
			pst.setString(3, crucero.getCategoria());
			pst.setInt(4, crucero.getId_ruta());
			pst.setInt(5, crucero.getId_crucero());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param nombreCrucero para seleccionar la id del crucero con ese nombre
	 * @return la id del crucero seleccionado
	 */
	public int getIdCrucero(String nombreCrucero) {
		int id_crucero = 0;
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT id_crucero FROM cruceros WHERE nombre = ?");
			
			pst.setString(1, nombreCrucero);
			
			ResultSet resultado = pst.executeQuery();
			
			resultado.next();
			
			id_crucero = resultado.getInt("id_crucero");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return id_crucero;
	}

	/**
	 * 
	 * @param id_crucero para seleccionar la ruta de ese crucero
	 * @return la id de la ruta seleccionada
	 */
	public int getId_ruta(int id_crucero) {
		int id_ruta = 0;
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT id_ruta FROM cruceros WHERE id_crucero = ?");
			
			pst.setInt(1, id_crucero);
			
			ResultSet resultado = pst.executeQuery();
			
			resultado.next();
			
			id_ruta = resultado.getInt("id_ruta");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return id_ruta;
	}
	
}
