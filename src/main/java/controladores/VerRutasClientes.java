package controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Ruta;
import modelo.modeloRuta;

/**
 * Servlet para seleccionar todas las rutas/clientes y verlas
 */
@WebServlet("/VerRutasClientes")
public class VerRutasClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerRutasClientes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		modeloRuta mR = new modeloRuta();

		mR.Conectar();
		ArrayList<Ruta> Todasrutas = mR.getRutas();
		mR.cerrar();

		request.setAttribute("rutas", Todasrutas);
		request.getRequestDispatcher("Rutas.jsp").forward(request, response);
		
		
		
		//intento de poner en el precio la habitacion más barata no hecho por falta de tiempo
		//modeloRuta mR = new modeloRuta();
		//modeloHabitacion mH = new modeloHabitacion();
		//modeloCrucero mC = new modeloCrucero();
		
		//mR.Conectar();
		//ArrayList<Ruta> Todasrutas = mR.getRutas();
		//mR.cerrar();
		
		
		//int idRuta = mR.getId_ruta();
		//int idCrucero = mC.getId_Crucero(idRuta);
		//Habitacion habitacionMasBarata = mH.getHabitacionMasBarata(idCrucero);
		    
	
		
		//request.setAttribute("habitacionMasBarata", habitacionMasBarata);
		//request.setAttribute("rutas", Todasrutas);
		//request.getRequestDispatcher("Rutas.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
