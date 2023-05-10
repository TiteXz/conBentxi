package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Parada;
import modelo.modeloParada;

/**
 * Servlet para seleccionar la parada para modificarla
 */
@WebServlet("/FormularioParada")
public class FormularioParada extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularioParada() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id_actividad = Integer.parseInt(request.getParameter("id_parada"));
		modeloParada mP = new modeloParada();
		
		mP.Conectar();
		Parada parada = new Parada();
		parada = mP.getParada(id_actividad);
		mP.cerrar();
		
		request.setAttribute("parada", parada);
		request.getRequestDispatcher("ModificarParada.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
