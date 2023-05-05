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
 * Servlet implementation class InsertarCrucero
 */
@WebServlet("/InsertarCrucero")
public class InsertarCrucero extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarCrucero() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//datuak jaso
		String nombre = request.getParameter("nombre");
		String capitan = request.getParameter("capitan");
		String categoria = request.getParameter("categoria");
		int id_ruta = Integer.parseInt(request.getParameter("id_ruta"));
		
		//insertatu
		modeloCrucero mC = new modeloCrucero();
		
		Crucero crucero = new Crucero();
		crucero.setNombre(nombre);
		crucero.setCapitan(capitan);
		crucero.setCategoria(categoria);
		crucero.setId_ruta(id_ruta);
		
		mC.Conectar();
		mC.ainadirCrucero(crucero);
		mC.cerrar();
		
		//insertatu ondoren 
		response.sendRedirect("VerCruceros");
	}

}
