package br.com.gerenciadorHotel.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciadorHotel.modelo.BancoReserva;
import br.com.gerenciadorHotel.modelo.Reserva;

/**
 * Servlet implementation class ListaReserva
 */
@WebServlet("/listaReserva")
public class ListaReserva extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BancoReserva bancoR = new BancoReserva();
		List<Reserva> reservas = bancoR.getReservas();
		
		request.setAttribute("reservas", reservas);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaReserva.jsp");
		rd.forward(request, response);
		
	}

}
