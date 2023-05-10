package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Cliente;
import modelo.modeloCliente;

/**
 * Servlet implementation class InsertarCliente
 */
@WebServlet("/InsertarCliente")
public class InsertarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("VistaAñadirCliente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
				//datuak jaso
				String dni = request.getParameter("dni");
				String nombre = request.getParameter("nombre");
				String apellido = request.getParameter("apellido");
				Boolean mayor_edad = request.getParameter("mayor_edad") == null? false :true;

				int num_tarjeta = Integer.parseInt(request.getParameter("num_tarjeta"));
				
				//insertatu
				modeloCliente mC = new modeloCliente();
				
				Cliente cliente = new Cliente();
				cliente.setDni(dni);
				cliente.setNombre(nombre);
				cliente.setApellido(apellido);
				cliente.setMayor_edad(mayor_edad);
				cliente.setNum_tarjeta(num_tarjeta);
				
				mC.Conectar();
				mC.ainadirUsuario(cliente);
				mC.cerrar();
				
				//insertatu ondoren 
				response.sendRedirect("VerClientes");
	}
}