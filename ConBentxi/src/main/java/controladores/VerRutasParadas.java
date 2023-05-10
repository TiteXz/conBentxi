package controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Ruta_parada;
import modelo.modeloRutaParada;

/**
 * Servlet implementation class VerRutasParadas
 */
@WebServlet("/VerRutasParadas")
public class VerRutasParadas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerRutasParadas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		modeloRutaParada mRP = new modeloRutaParada();
		
		mRP.Conectar();
		ArrayList<Ruta_parada> rutasParadas = mRP.getRutasParadas();
		mRP.cerrar();
		
		request.setAttribute("rutasParadas", rutasParadas);
		request.getRequestDispatcher("VistaRutasParadas.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
