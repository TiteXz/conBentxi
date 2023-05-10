package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.modeloRutaParada;
import clases.Ruta_parada;

/**
 * Servlet para insertar una ruta/parada en la BBDD
 */
@WebServlet("/InsertarRutaParada")
public class InsertarRutaParada extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarRutaParada() {
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
		
		Ruta_parada rutaParada = new Ruta_parada();
		
		rutaParada.setId_ruta(id_ruta);
		rutaParada.setId_parada(id_parada);
		
		mRP.Conectar();
		mRP.ainadirRutaParada(rutaParada);
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
