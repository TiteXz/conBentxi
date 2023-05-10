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
 * Servlet para seleccionar el cliente para modificarlo
 */
@WebServlet("/FormularioCliente")
public class FormularioCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularioCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		modeloCliente mC = new modeloCliente();
		
		String dni = request.getParameter("dni");
		
		mC.Conectar();
		Cliente cliente = mC.getCliente(dni);
		mC.cerrar();
		
		request.setAttribute("cliente", cliente);
		request.getRequestDispatcher("ModificarCliente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
