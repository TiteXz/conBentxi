package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Puerto;
import modelo.modeloPuerto;

/**
 * Servlet implementation class ModificarPuerto
 */
@WebServlet("/ModificarPuerto")
public class ModificarPuerto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarPuerto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		modeloPuerto mP = new modeloPuerto();
	
		int id_puerto = Integer.parseInt(request.getParameter("id_puerto"));
		String pais = request.getParameter("pais");
		String ciudad = request.getParameter("ciudad");
		int amarre = Integer.parseInt(request.getParameter("amarre"));
		
		Puerto puerto = new Puerto();
		
		puerto.setId_puerto(id_puerto);
		puerto.setPais(pais);
		puerto.setCiudad(ciudad);
		puerto.setAmarre(amarre);
		
		mP.Conectar();
		mP.modificarPuerto(puerto);
		mP.cerrar();
		
		request.getRequestDispatcher("VerPuertos").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
