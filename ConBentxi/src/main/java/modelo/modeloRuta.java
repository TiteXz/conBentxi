package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

import clases.Ruta;

public class modeloRuta extends Conexion{

	public void ainadirRuta(Ruta ruta) {
		
		try {
			PreparedStatement pst = conexion.prepareStatement("INSERT INTO rutas (fecha_ini, fecha_fin, origen, destino) VALUES (?,?,?,?)");
			pst.setDate(1, new Date(ruta.getFecha_ini().getTime()));
			pst.setDate(2, new Date(ruta.getFecha_fin().getTime()));
			pst.setString(3, ruta.getOrigen());
			pst.setString(4, ruta.getDestino());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eliminarRuta(int id_ruta) {
		
		PreparedStatement pst;
		try {
			pst = conexion.prepareStatement("DELETE FROM rutas WHERE id_ruta = ?");
			pst.setInt(1, id_ruta);
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Ruta> buscarRutasNombre(String destino){
		ArrayList<Ruta>rutas = new ArrayList<Ruta>();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("Select * FROM rutas WHERE destino LIKE ?");
			pst.setString(1, "%" + destino + "%");
			
			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()) {
				Ruta ruta = new Ruta();
				
				ruta.setId_ruta(resultado.getInt("id_ruta"));
				ruta.setFecha_ini(resultado.getDate("fecha_ini"));
				ruta.setFecha_fin(resultado.getDate("fecha_fin"));
				ruta.setOrigen(resultado.getString("origen"));
				ruta.setDestino(resultado.getString("destino"));
				
				rutas.add(ruta);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return rutas;
		
	}
	
	public ArrayList<Ruta> buscarRutasId(int id_ruta) {
		
		ArrayList<Ruta>rutas = new ArrayList<Ruta>();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("Select * FROM rutas WHERE id_ruta = ?");
			pst.setInt(1, id_ruta);
			
			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()) {
				Ruta ruta = new Ruta();
				
				ruta.setId_ruta(resultado.getInt("id_ruta"));
				ruta.setFecha_ini(resultado.getDate("fecha_ini"));
				ruta.setFecha_fin(resultado.getDate("fecha_fin"));
				ruta.setOrigen(resultado.getString("origen"));
				ruta.setDestino(resultado.getString("destino"));
				
				rutas.add(ruta);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return rutas;
		
	}
	
	
	public ArrayList<Ruta> getRutas() {
		ArrayList<Ruta> rutas = new ArrayList<Ruta>();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM rutas");
			
			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()) {
				Ruta ruta = new Ruta();
				
				ruta.setId_ruta(resultado.getInt("id_ruta"));
				ruta.setFecha_ini(resultado.getDate("fecha_ini"));
				ruta.setFecha_fin(resultado.getDate("fecha_fin"));
				ruta.setOrigen(resultado.getString("origen"));
				ruta.setDestino(resultado.getString("destino"));
				
				rutas.add(ruta);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rutas;
	}
	
	public Ruta getRuta(int id_ruta) {
		Ruta ruta = new Ruta();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM rutas WHERE id_ruta = ?");
			
			pst.setInt(1, id_ruta);
			
			ResultSet resultado = pst.executeQuery();
			
			resultado.next();
			ruta.setId_ruta(resultado.getInt("id_ruta"));
			ruta.setFecha_ini(resultado.getDate("fecha_ini"));
			ruta.setFecha_fin(resultado.getDate("fecha_fin"));
			ruta.setOrigen(resultado.getString("origen"));
			ruta.setDestino(resultado.getString("destino"));
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ruta;
	}
	
	
	
	public void modificarRuta(Ruta ruta) {
		try {
			PreparedStatement pst = conexion.prepareStatement("UPDATE rutas SET fecha_ini=?, fecha_fin=?, origen=?, destino=? WHERE id_ruta=?");
			
			pst.setDate(1, new Date(ruta.getFecha_ini().getTime()));
			pst.setDate(2, new Date(ruta.getFecha_fin().getTime()));
			pst.setString(3, ruta.getOrigen());
			pst.setString(4, ruta.getDestino());
			pst.setInt(5, ruta.getId_ruta());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
