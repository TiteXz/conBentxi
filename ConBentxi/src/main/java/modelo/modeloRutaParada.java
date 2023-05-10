package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Ruta_parada;

public class modeloRutaParada extends Conexion{

	public void ainadirRutaParada(Ruta_parada rutaParada) {
		try {
			PreparedStatement pst = conexion.prepareStatement("INSERT INTO rutas_paradas (id_ruta, id_parada) VALUES (?,?)");
			
			pst.setInt(1, rutaParada.getId_ruta());
			pst.setInt(2, rutaParada.getId_parada());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void eliminarRutaParada(int id_ruta, int id_parada) {
		try {
			PreparedStatement pst = conexion.prepareStatement("DELETE FROM rutas_paradas WHERE id_ruta = ? AND id_parada = ?");
			
			pst.setInt(1, id_ruta);
			pst.setInt(2, id_parada);
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Ruta_parada> getRutasParadas(){
		ArrayList<Ruta_parada> rutasParadas = new ArrayList<Ruta_parada>();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM rutas_paradas");
			
			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()) {
				Ruta_parada rutaParada = new Ruta_parada();
				
				rutaParada.setId_ruta(resultado.getInt("id_ruta"));
				rutaParada.setId_parada(resultado.getInt("id_parada"));
				
				rutasParadas.add(rutaParada);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rutasParadas;
	}
}
