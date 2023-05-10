package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.modeloHabitacion;

/**
 * Servlet implementation class EliminarHabitacion
 */
@WebServlet("/EliminarHabitacion")
public class EliminarHabitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarHabitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		modeloHabitacion mH = new modeloHabitacion();
		int numero_habitacion = Integer.parseInt(request.getParameter("numero_habitacion"));
		
		mH.Conectar();
		mH.eliminarHabitacion(numero_habitacion);
		mH.cerrar();
		
		response.sendRedirect("VerHabitaciones");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
