package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.modeloActividad;
import clases.Actividad;

/**
 * Servlet para seleccionar la actividad para modificarla
 */
@WebServlet("/FormularioActividad")
public class FormularioActividad extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularioActividad() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id_actividad = Integer.parseInt(request.getParameter("id_actividad"));
		modeloActividad mA = new modeloActividad();
		
		mA.Conectar();
		Actividad actividad = new Actividad();
		actividad = mA.getActividad(id_actividad);
		mA.cerrar();
		
		request.setAttribute("actividad", actividad);
		request.getRequestDispatcher("ModificarActividad.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
