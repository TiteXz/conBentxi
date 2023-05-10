package controladores;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Parada;
import modelo.modeloParada;

/**
 * Servlet implementation class InsertarParada
 */
@WebServlet("/InsertarParada")
public class InsertarParada extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarParada() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		modeloParada mP = new modeloParada();
		
		String ciudad = request.getParameter("ciudad");
		String pais = request.getParameter("pais");
		int tiempo_estacionamiento = Integer.parseInt(request.getParameter("tiempo_estacionamiento"));
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		
		Parada parada = new Parada();
		
		parada.setCiudad(ciudad);
		parada.setPais(pais);
		parada.setTiempo_estacionamiento(tiempo_estacionamiento);
		try {
			parada.setFecha_salida(formato.parse(request.getParameter("fecha_salida")));
			parada.setFecha_llegada(formato.parse(request.getParameter("fecha_llegada")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mP.Conectar();
		mP.ainadirParada(parada);
		mP.cerrar();
		
		response.sendRedirect("VerParadas");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
