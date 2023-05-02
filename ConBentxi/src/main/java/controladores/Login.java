package controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Empleado;
import modelo.Conexion;
import modelo.ModeloEmpleados;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");

		ModeloEmpleados me = new ModeloEmpleados();

		me.Conectar();
		ArrayList<Empleado> getUsuariosPassword = me.getUsuariosPassword();
		me.cerrar();

		Empleado empleado = new Empleado();

		for (Empleado empleados : getUsuariosPassword) {
			System.out.println("Usuario: " + empleados.getUsuario());
			System.out.println("Contraseña: " + empleados.getPassword());

			if (empleados.getUsuario().equals(usuario) && empleados.getPassword().equals(password)) {
				empleado.setPassword(password);
				empleado.setUsuario(usuario);
			}
			else {
				empleado=null;
			}
		}
		try {
			if (!empleado.equals(null)) {
				response.sendRedirect("Bienvenido.jsp");
			} else {
				response.sendRedirect("FormLogin.jsp");
			}
		}catch(Exception e) {
			response.sendRedirect("FormLogin.jsp");
		}
			
		

		// if (usuario.equals("ikaslea") & password.equals("1234")) {
//			request.getRequestDispatcher("Bienvenido.jsp").forward(request, response);
//		}else {
//			request.getRequestDispatcher("FormLogin.jsp").forward(request, response);
//
//		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
