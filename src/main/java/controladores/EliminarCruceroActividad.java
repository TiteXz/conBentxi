package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.CruceroActividad;
import modelo.modeloCruceroActividad;

/**
 * Servlet para eliminar un crucero/actividad de la BBDD
 */
@WebServlet("/EliminarCruceroActividad")
public class EliminarCruceroActividad extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarCruceroActividad() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		modeloCruceroActividad mCA = new modeloCruceroActividad();
		CruceroActividad cruceroActividad = new CruceroActividad();
		
		int id_crucero = Integer.parseInt(request.getParameter("id_crucero"));
		int id_actividad = Integer.parseInt(request.getParameter("id_actividad"));
		
		cruceroActividad.setId_crucero(id_crucero);
		cruceroActividad.setId_actividad(id_actividad);
		
		mCA.Conectar();
		mCA.eliminarCruceroActividad(cruceroActividad);
		mCA.cerrar();
		
		response.sendRedirect("VerCrucerosActividades");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
