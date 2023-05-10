package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Inscripcion;
import modelo.modeloInscripcion;

/**
 * Servlet para insertar una inscripcion en la BBDD
 */
@WebServlet("/InsertarInscripcion")
public class InsertarInscripcion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarInscripcion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		modeloInscripcion mI = new modeloInscripcion();
		
		String dni_cliente = request.getParameter("dni_cliente");
		int id_actividad = Integer.parseInt(request.getParameter("id_actividad"));
		
		Inscripcion inscripcion = new Inscripcion();
		
		inscripcion.setDni_cliente(dni_cliente);
		inscripcion.setId_actividad(id_actividad);
		
		mI.Conectar();
		mI.ainadirInscripcion(inscripcion);
		mI.cerrar();
		
		response.sendRedirect("VerInscripciones");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
