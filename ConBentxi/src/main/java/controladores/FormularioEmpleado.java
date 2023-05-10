package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Empleado;
import modelo.modeloEmpleado;

/**
 * Servlet implementation class FormularioEmpleado
 */
@WebServlet("/FormularioEmpleado")
public class FormularioEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularioEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		modeloEmpleado mE = new modeloEmpleado();
		
		int id_empleado = Integer.parseInt(request.getParameter("id_empleado"));
		
		mE.Conectar();
		Empleado empleado = mE.getEmpleado(id_empleado);
		mE.cerrar();
		
		request.setAttribute("empleado", empleado);
		request.getRequestDispatcher("ModificarEmpleado.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
