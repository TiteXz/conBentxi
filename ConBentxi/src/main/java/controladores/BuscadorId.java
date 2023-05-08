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
 * Servlet implementation class BuscadorId
 */
@WebServlet("/BuscadorId")
public class BuscadorId extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscadorId() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id_ruta = Integer.parseInt(request.getParameter("id_ruta"));
		
		modeloRuta mR = new modeloRuta();
		
		
		mR.Conectar();
		ArrayList<Ruta> rutas = mR.buscarRutasId(id_ruta);
		mR.cerrar();
		
		request.setAttribute("rutas", rutas);
		if(rutas==null) {
			request.getRequestDispatcher("RutasNada.jsp").forward(request, response);
		}else
		request.getRequestDispatcher("Rutas.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
