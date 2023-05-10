package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.modeloCrucero;

/**
 * Servlet para eliminar un crucero de la BBDD
 */
@WebServlet("/EliminarCrucero")
public class EliminarCrucero extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarCrucero() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		modeloCrucero mC = new modeloCrucero();
		int id_crucero = Integer.parseInt(request.getParameter("id_crucero"));
		
		mC.Conectar();
		mC.eliminarCruceros(id_crucero);
		mC.cerrar();
		
		response.sendRedirect("VerCruceros");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
