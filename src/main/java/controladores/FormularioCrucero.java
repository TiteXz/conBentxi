package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Crucero;
import modelo.modeloCrucero;

/**
 * Servlet para seleccionar el crucero para modificarlo
 */
@WebServlet("/FormularioCrucero")
public class FormularioCrucero extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularioCrucero() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id_crucero = Integer.parseInt(request.getParameter("id_crucero"));
		modeloCrucero mC = new modeloCrucero();
		
		mC.Conectar();
		Crucero crucero = new Crucero();
		crucero = mC.getCrucero(id_crucero);
		mC.cerrar();
		
		request.setAttribute("crucero", crucero);
		request.getRequestDispatcher("ModificarCrucero.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
