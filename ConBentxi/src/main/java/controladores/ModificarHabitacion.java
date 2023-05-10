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
 * Servlet implementation class InsertarHabitacion
 */
@WebServlet("/ModificarHabitacion")
public class ModificarHabitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarHabitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		modeloHabitacion mH = new modeloHabitacion();
		
		int numero_habitacion = Integer.parseInt(request.getParameter("numero_habitacion"));
		String descripcion = request.getParameter("descripcion");
		double precio = Double.parseDouble(request.getParameter("precio"));
		String imagen = request.getParameter("imagen");
		
		Habitacion habitacion = new Habitacion();
		
		habitacion.setNumero_habitacion(numero_habitacion);
		habitacion.setDescripcion(descripcion);
		habitacion.setPrecio(precio);
		habitacion.setImagen(imagen);
		
		mH.Conectar();
		mH.modificarHabitacion(habitacion);
		mH.cerrar();
		
		request.getRequestDispatcher("VerHabitaciones").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
