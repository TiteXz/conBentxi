package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Reserva;
import clases.Ruta;
import modelo.modeloCrucero;
import modelo.modeloHabitacion;
import modelo.modeloReserva;
import modelo.modeloRuta;

/**
 * Servlet para que un cliente haga la reserva de una habitacion
 */
@WebServlet("/HacerReserva")
public class HacerReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HacerReserva() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//datuak jaso
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombreCrucero = request.getParameter("NombreCrucero");
		String dni = request.getParameter("dniCliente");
		Double precio = Double.parseDouble(request.getParameter("precio"));
		
		
		modeloCrucero mC = new modeloCrucero();
		modeloRuta mR = new modeloRuta();
		modeloHabitacion mH = new modeloHabitacion();
		modeloReserva mRe = new modeloReserva();
		
		//insertatu
		mC.Conectar();
		int id_crucero = mC.getIdCrucero(nombreCrucero);
		int id_ruta = mC.getId_ruta(id_crucero);
		mC.cerrar();
		mR.Conectar();
		Ruta ruta = mR.getRuta(id_ruta);	
		mR.cerrar();
		mH.Conectar();
		int numero_habitacion = mH.getNumeroHabitacion(precio);
		mH.cerrar();
		
		Reserva reserva = new Reserva();
		reserva.setId_crucero(id_crucero);
		reserva.setDni_cliente(dni);
		reserva.setFecha_ini(ruta.getFecha_ini());
		reserva.setFecha_fin(ruta.getFecha_fin());
		reserva.setNumero_habitacion(numero_habitacion);
		
		mRe.Conectar();
		mRe.ainadirReserva(reserva);
		mRe.cerrar();
		
		request.getRequestDispatcher("Home.jsp").forward(request, response);
	}

}
