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
			PreparedStatement pst = conexion.prepareStatement("INSERT INTO rutas (id_ruta, fecha_ini, fecha_fin, origen, destino, precio) VALUES (?,?,?,?,?,?)");
			pst.setInt(1, ruta.getId_ruta());
			pst.setDate(2, new Date(ruta.getFecha_ini().getTime()));
			pst.setDate(3, new Date(ruta.getFecha_fin().getTime()));
			pst.setString(4, ruta.getOrigen());
			pst.setString(5, ruta.getDestino());
			pst.setDouble(6, ruta.getPrecio());
			
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

	public ArrayList<Ruta> buscarRutas(String destino){
		ArrayList<Ruta>rutas = new ArrayList<Ruta>();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("Select * FROM rutas WHERE destino = ?");
			pst.setString(1, destino);
			
			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()) {
				Ruta ruta = new Ruta();
				
				ruta.setId_ruta(resultado.getInt("id_ruta"));
				ruta.setFecha_ini(resultado.getDate("fecha_ini"));
				ruta.setFecha_fin(resultado.getDate("fecha_fin"));
				ruta.setOrigen(resultado.getString("origen"));
				ruta.setDestino(resultado.getString("destino"));
				ruta.setPrecio(resultado.getDouble("precio"));
				
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
				ruta.setPrecio(resultado.getDouble("precio"));
				
				rutas.add(ruta);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rutas;
	}
	
	public void modificarRuta(Ruta ruta) {
		try {
			PreparedStatement pst = conexion.prepareStatement("UPDATE rutas SET fecha_ini=?, fecha_fin=?, origen=?, destino=?, precio=? WHERE id_ruta=?");
			
			pst.setDate(1, new Date(ruta.getFecha_ini().getTime()));
			pst.setDate(2, new Date(ruta.getFecha_fin().getTime()));
			pst.setString(3, ruta.getOrigen());
			pst.setString(4, ruta.getDestino());
			pst.setDouble(5, ruta.getPrecio());
			pst.setInt(6, ruta.getId_ruta());
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
