package br.com.gerenciadorHotel.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciadorHotel.modelo.BancoCliente;
import br.com.gerenciadorHotel.modelo.Cliente;

/**
 * Servlet implementation class ListaCliente
 */
@WebServlet("/ListaCliente")
public class ListaCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		BancoCliente bancoC = new BancoCliente();
		List<Cliente> clientes = bancoC.getClientes();
		
		request.setAttribute("clientes", clientes);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaCliente.jsp");
		rd.forward(request, response);
		
	}

}
