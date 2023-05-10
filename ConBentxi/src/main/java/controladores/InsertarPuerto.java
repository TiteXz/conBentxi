package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.modeloPuerto;
import clases.Puerto;

/**
 * Servlet implementation class InsertarPuerto
 */
@WebServlet("/InsertarPuerto")
public class InsertarPuerto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarPuerto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		modeloPuerto mP = new modeloPuerto();
		
		String pais = request.getParameter("pais");
		String ciudad = request.getParameter("ciudad");
		int amarre = Integer.parseInt(request.getParameter("amarre"));
		
		Puerto puerto = new Puerto();
		
		puerto.setPais(pais);
		puerto.setCiudad(ciudad);
		puerto.setAmarre(amarre);
		
		mP.Conectar();
		mP.ainadirPuerto(puerto);
		mP.cerrar();
		
		response.sendRedirect("VerPuertos");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
