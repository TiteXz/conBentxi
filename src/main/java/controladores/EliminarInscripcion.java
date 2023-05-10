package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.modeloInscripcion;

/**
 * Servlet para eliminar una inscripcion de la BBDD
 */
@WebServlet("/EliminarInscripcion")
public class EliminarInscripcion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarInscripcion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		modeloInscripcion mI = new modeloInscripcion();
		String dni_cliente = request.getParameter("dni_cliente");
		int id_actividad = Integer.parseInt(request.getParameter("id_actividad"));
		
		mI.Conectar();
		mI.eliminarInscripcion(dni_cliente, id_actividad);
		mI.cerrar();
		
		response.sendRedirect("VerInscripciones");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
