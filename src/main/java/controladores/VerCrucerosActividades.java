package controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.CruceroActividad;
import modelo.modeloCruceroActividad;

/**
 * Servlet para seleccionar todos los cruceros/actividades y verlos
 */
@WebServlet("/VerCrucerosActividades")
public class VerCrucerosActividades extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerCrucerosActividades() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		modeloCruceroActividad mCA = new modeloCruceroActividad();
		
		mCA.Conectar();
		ArrayList<CruceroActividad> crucerosActividades = mCA.getCrucerosActividades();
		mCA.cerrar();
		
		request.setAttribute("crucerosActividades", crucerosActividades);
		request.getRequestDispatcher("VistaCrucerosActividades.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
