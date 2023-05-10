package controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Crucero;
import clases.Habitacion;
import clases.Ruta;
import modelo.modeloCrucero;
import modelo.modeloHabitacion;
import modelo.modeloRuta;

/**
 * Servlet para mandar a la vista una lista de las habitaciones de un crucero de una ruta
 */
@WebServlet("/ReservarRuta")
public class ReservarRuta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservarRuta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id_ruta = Integer.parseInt(request.getParameter("id_ruta"));
		
		modeloHabitacion mH = new modeloHabitacion();
		modeloCrucero mC = new modeloCrucero();
		modeloRuta mR = new modeloRuta();
		
		mR.Conectar();
		Ruta ruta = mR.getRuta(id_ruta);
		mR.cerrar();
		
		mC.Conectar();
		Crucero crucero = mC.getCrucero(id_ruta);
		int id_crucero = mC.getId_Crucero(id_ruta);
		mC.cerrar();
		
		mH.Conectar();
		ArrayList<Habitacion> habitaciones = mH.getHabitacionesCrucero(id_crucero);
		mH.cerrar();
		
		request.setAttribute("ruta", ruta);
		request.setAttribute("crucero", crucero);
		request.setAttribute("habitaciones", habitaciones);
		request.getRequestDispatcher("ReservarRuta.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
