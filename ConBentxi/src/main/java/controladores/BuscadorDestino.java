package controladores;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Ruta;
import modelo.modeloRuta;

/**
 * Servlet implementation class BuscadorDestino
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
		
		
		mR.Conectar();
		ArrayList<Ruta> rutas = mR.buscarRutas(destino);
		mR.cerrar();
		
		request.setAttribute("rutas", rutas);
		if(destino==null) {
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
