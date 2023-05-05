package controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Crucero;
import modelo.modeloCrucero;

/**
 * Servlet implementation class VerCrucerosClientes
 */
@WebServlet("/VerCrucerosClientes")
public class VerCrucerosClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerCrucerosClientes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		modeloCrucero mC = new modeloCrucero();
		
		mC.Conectar();
		ArrayList<Crucero> cruceros = mC.getCruceros();
		mC.cerrar();
		
		request.setAttribute("cruceros", cruceros);
		request.getRequestDispatcher("Cruceros.jsp").forward(request, response);	
		
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
