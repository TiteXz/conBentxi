package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.modeloRutaParada;

/**
 * Servlet implementation class EliminarRutaParada
 */
@WebServlet("/EliminarRutaParada")
public class EliminarRutaParada extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarRutaParada() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		modeloRutaParada mRP = new modeloRutaParada();
		
		int id_ruta = Integer.parseInt(request.getParameter("id_ruta"));
		int id_parada = Integer.parseInt(request.getParameter("id_parada"));
		
		mRP.Conectar();
		mRP.eliminarRutaParada(id_ruta, id_parada);
		mRP.cerrar();
		
		response.sendRedirect("VerRutasParadas");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
