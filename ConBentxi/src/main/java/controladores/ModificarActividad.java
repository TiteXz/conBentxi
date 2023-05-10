package controladores;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Actividad;
import modelo.modeloActividad;

/**
 * Servlet implementation class ModificarActividad
 */
@WebServlet("/ModificarActividad")
public class ModificarActividad extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarActividad() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		modeloActividad mA = new modeloActividad();
		
		int id_actividad = Integer.parseInt(request.getParameter("id_actividad"));
		String nombre = request.getParameter("nombre");
		SimpleDateFormat fecha_ini = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat fecha_fin = new SimpleDateFormat("yyyy-MM-dd");
		String descripcion = request.getParameter("descripcion");
		int id_empleado = Integer.parseInt(request.getParameter("id_empleado"));
		
		Actividad actividad = new Actividad();
		actividad.setId_actividad(id_actividad);
		actividad.setNombre(nombre);
		try {
			actividad.setFecha_ini(fecha_ini.parse(request.getParameter("fecha_ini")));
			actividad.setFecha_fin(fecha_fin.parse(request.getParameter("fecha_fin")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actividad.setDescripcion(descripcion);
		actividad.setId_empleado(id_empleado);
		
		mA.Conectar();
		mA.modificarActividad(actividad);
		mA.cerrar();
		
		request.getRequestDispatcher("VerActividades").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
