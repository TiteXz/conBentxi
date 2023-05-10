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
 * Servlet recibe una cadena de caracteres y lo busca entre las rutas
 */
@WebServlet("/BuscadorDestino")
public class BuscadorDestino extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscadorDestino() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//datuak jaso
		
		String destino = request.getParameter("destino");
		
		modeloRuta mR = new modeloRuta();
		
		
		if(destino.equals("todas")) {
			mR.Conectar();
			ArrayList<Ruta> Todasrutas = mR.getRutas();
			mR.cerrar();
			request.setAttribute("rutas", Todasrutas);
			request.getRequestDispatcher("Rutas.jsp").forward(request, response);
		}else if(destino.equals("")) {
			mR.Conectar();
			ArrayList<Ruta> rutas = mR.buscarRutasNombre(destino);
			mR.cerrar();
			request.setAttribute("rutas", rutas);
			request.getRequestDispatcher("RutasNada.jsp").forward(request, response);
		}else if(destino!=null) {
			mR.Conectar();
			ArrayList<Ruta> rutas = mR.buscarRutasNombre(destino);
			mR.cerrar();
			request.setAttribute("rutas", rutas);
			request.getRequestDispatcher("Rutas.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
