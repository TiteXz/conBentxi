package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Crucero;
import modelo.modeloCrucero;

/**
 * Servlet para modificar un crucero con nuevos datos
 */
@WebServlet("/ModificarCrucero")
public class ModificarCrucero extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarCrucero() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		modeloCrucero mC = new modeloCrucero();
		
		int id_crucero = Integer.parseInt(request.getParameter("id_crucero"));
		String nombre = request.getParameter("nombre");
		String capitan = request.getParameter("capitan");
		String categoria = request.getParameter("categoria");
		int id_ruta = Integer.parseInt(request.getParameter("id_ruta"));
		
		Crucero crucero = new Crucero();
		crucero.setId_crucero(id_crucero);
		crucero.setNombre(nombre);
		crucero.setCapitan(capitan);
		crucero.setCategoria(categoria);
		crucero.setId_ruta(id_ruta);
		
		//update
		mC.Conectar();
		mC.modificarCrucero(crucero);
		mC.cerrar();
		
		request.getRequestDispatcher("VerCruceros").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
