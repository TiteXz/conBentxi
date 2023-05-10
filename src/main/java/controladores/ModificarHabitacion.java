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
 * Servlet para modificar una habitacion con nuevos datos
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
		int id_crucero = Integer.parseInt(request.getParameter("id_crucero"));
		int id_empleado = Integer.parseInt(request.getParameter("id_empleado"));
		String imagen = request.getParameter("imagen");
		String dni_cliente = request.getParameter("dni_cliente");

		Habitacion habitacion = new Habitacion();

		habitacion.setNumero_habitacion(numero_habitacion);
		habitacion.setDescripcion(descripcion);
		habitacion.setPrecio(precio);
		habitacion.setId_crucero(id_crucero);
		habitacion.setId_empleado(id_empleado);
		habitacion.setImagen(imagen);
		habitacion.setDni_cliente(dni_cliente);

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
