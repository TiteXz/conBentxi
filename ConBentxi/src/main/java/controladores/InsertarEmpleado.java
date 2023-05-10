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
 * Servlet implementation class InsertarEmpleado
 */
@WebServlet("/InsertarEmpleado")
public class InsertarEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		modeloEmpleado mE = new modeloEmpleado();
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String trabajo = request.getParameter("trabajo");
		int id_crucero = Integer.parseInt(request.getParameter("id_crucero"));
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		Empleado empleado = new Empleado();
		empleado.setNombre(nombre);
		empleado.setApellido(apellido);
		empleado.setTrabajo(trabajo);
		empleado.setId_crucero(id_crucero);
		empleado.setUsuario(usuario);
		empleado.setPassword(password);
		
		mE.Conectar();
		mE.ainadirEmpleado(empleado);
		mE.cerrar();
		
		response.sendRedirect("VerEmpleados");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
