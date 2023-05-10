package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Estacionamiento;
import modelo.modeloEstacionamiento;

/**
 * Servlet para eliminar un estacionamiento de la BBDD
 */
@WebServlet("/EliminarEstacionamiento")
public class EliminarEstacionamiento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarEstacionamiento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		modeloEstacionamiento mE = new modeloEstacionamiento();
		Estacionamiento estacionamiento = new Estacionamiento();
		
		int id_crucero = Integer.parseInt(request.getParameter("id_crucero"));
		int id_puerto = Integer.parseInt(request.getParameter("id_puerto"));
		
		estacionamiento.setId_crucero(id_crucero);
		estacionamiento.setId_puerto(id_puerto);
		
		mE.Conectar();
		mE.eliminarEstacionamiento(estacionamiento);
		mE.cerrar();
		
		response.sendRedirect("VerEstacionamientos");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
