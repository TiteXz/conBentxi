package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.modeloReserva;

/**
 * Servlet implementation class EliminarReserva
 */
@WebServlet("/EliminarReserva")
public class EliminarReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarReserva() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		modeloReserva mR = new modeloReserva();
		String dni_cliente = request.getParameter("dni_cliente");
		int id_crucero = Integer.parseInt(request.getParameter("id_crucero"));
		int numero_habitacion = Integer.parseInt(request.getParameter("numero_habitacion"));
		
		mR.Conectar();
		mR.eliminarReserva(dni_cliente, id_crucero, numero_habitacion);
		mR.cerrar();
		
		response.sendRedirect("VerReservas");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
