package controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Empleado;
import modelo.modeloEmpleado;

/**
 * Servlet para seleccionar todos los empleados y verlos
 */
@WebServlet("/VerEmpleados")
public class VerEmpleados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerEmpleados() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		modeloEmpleado mE = new modeloEmpleado();
		
		mE.Conectar();
		ArrayList<Empleado> empleados = mE.getEmpleados();
		mE.cerrar();
		
		request.setAttribute("empleados", empleados);
		request.getRequestDispatcher("VistaEmpleados.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
