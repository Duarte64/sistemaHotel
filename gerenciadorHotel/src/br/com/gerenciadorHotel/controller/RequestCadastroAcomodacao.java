package br.com.gerenciadorHotel.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.gerenciadorHotel.modelo.*;

/**
 * Servlet implementation class RequestCadastroCliente
 */

@WebServlet("/requestCadastroAcomodacao")
public class RequestCadastroAcomodacao extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nomeQuarto");
		String custoDiaria = request.getParameter("custoDia");
		String descricao = request.getParameter("descricaoQuarto");
		String tipoQuarto = request.getParameter("tiposQuarto");
		
	    Acomodacao acomodacao = null;
	    
		if (Integer.parseInt(tipoQuarto) == 1) {
			acomodacao = new AcomodacaoSimples(nome, Float.parseFloat(custoDiaria), descricao);
		} else if (Integer.parseInt(tipoQuarto) == 2) {
			acomodacao = new AcomodacaoPadrao(nome, Float.parseFloat(custoDiaria), descricao);
		} else if (Integer.parseInt(tipoQuarto) == 3) {
			acomodacao = new AcomodacaoLuxo(nome, Float.parseFloat(custoDiaria), descricao);
		}
		
		BancoAcomodacao bancoA = new BancoAcomodacao();
		bancoA.adiciona(acomodacao);
		
		request.setAttribute("acomodacao", acomodacao.getNome());
		
		response.sendRedirect("listaAcomodacao");
	}

}
