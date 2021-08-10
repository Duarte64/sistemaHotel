package br.com.gerenciadorHotel.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciadorHotel.modelo.*;

/**
 * Servlet implementation class ListaCliente
 */
@WebServlet("/listaAcomodacao")
public class ListaAcomodacao extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BancoAcomodacao bancoA = new BancoAcomodacao();
		List<Acomodacao> acomodacoes = bancoA.getAcomodacoes();
		
		request.setAttribute("acomodacoes", acomodacoes);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaAcomodacao.jsp");
		rd.forward(request, response);
		
	}

}

