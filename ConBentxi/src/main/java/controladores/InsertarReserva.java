package controladores;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Reserva;
import modelo.modeloReserva;

/**
 * Servlet implementation class InsertarReserva
 */
@WebServlet("/InsertarReserva")
public class InsertarReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarReserva() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		modeloReserva mR = new modeloReserva();
		
		String dni_cliente = request.getParameter("dni_cliente");
		int id_crucero = Integer.parseInt(request.getParameter("id_crucero"));
		SimpleDateFormat fecha_ini = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat fecha_fin = new SimpleDateFormat("yyyy-MM-dd");
		int numero_habitacion = Integer.parseInt(request.getParameter("numero_habitacion"));
		
		Reserva reserva = new Reserva();
		
		reserva.setDni_cliente(dni_cliente);
		reserva.setId_crucero(id_crucero);
		try {
			reserva.setFecha_ini(fecha_ini.parse(request.getParameter("fecha_ini")));
			reserva.setFecha_fin(fecha_fin.parse(request.getParameter("fecha_fin")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		reserva.setNumero_habitacion(numero_habitacion);
		
		mR.Conectar();
		mR.ainadirReserva(reserva);
		mR.cerrar();
		
		response.sendRedirect("VerReservas");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
