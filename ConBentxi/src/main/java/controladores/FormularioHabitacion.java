package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Habitacion;
import modelo.modeloHabitacion;

/**
 * Servlet implementation class FormularioHabitacion
 */
@WebServlet("/FormularioHabitacion")
public class FormularioHabitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularioHabitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int numero_habitacion = Integer.parseInt(request.getParameter("numero_habitacion"));
		modeloHabitacion mH = new modeloHabitacion();
		
		mH.Conectar();
		Habitacion habitacion = new Habitacion();
		habitacion = mH.getHabitacion(numero_habitacion);
		mH.cerrar();
		
		request.setAttribute("habitacion", habitacion);
		request.getRequestDispatcher("ModificarHabitacion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
