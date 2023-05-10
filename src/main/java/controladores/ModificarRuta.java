package controladores;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Ruta;
import modelo.modeloRuta;

/**
 * Servlet para modificar una ruta con nuevos datos
 */
@WebServlet("/ModificarRuta")
public class ModificarRuta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarRuta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		modeloRuta mR = new modeloRuta();
		
		int id_ruta = Integer.parseInt(request.getParameter("id_ruta"));
		SimpleDateFormat fecha_ini = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat fecha_fin = new SimpleDateFormat("yyyy-MM-dd");
		String origen = request.getParameter("origen");
		String destino = request.getParameter("destino");
		
		Ruta ruta = new Ruta();
		ruta.setId_ruta(id_ruta);
		try {
			ruta.setFecha_ini(fecha_ini.parse(request.getParameter("fecha_ini")));
			ruta.setFecha_fin(fecha_fin.parse(request.getParameter("fecha_fin")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ruta.setOrigen(origen);
		ruta.setDestino(destino);
		
		mR.Conectar();
		mR.modificarRuta(ruta);
		mR.cerrar();
		
		request.getRequestDispatcher("VerRutas").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
