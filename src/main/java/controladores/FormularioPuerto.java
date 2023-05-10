package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Puerto;
import modelo.modeloPuerto;

/**
 * Servlet para seleccionar el puerto para modificarlo
 */
@WebServlet("/FormularioPuerto")
public class FormularioPuerto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularioPuerto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id_puerto = Integer.parseInt(request.getParameter("id_puerto"));
		modeloPuerto mP = new modeloPuerto();
		
		mP.Conectar();
		Puerto puerto = new Puerto();
		puerto = mP.getPuerto(id_puerto);
		mP.cerrar();
		
		request.setAttribute("puerto", puerto);
		request.getRequestDispatcher("ModificarPuerto.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
