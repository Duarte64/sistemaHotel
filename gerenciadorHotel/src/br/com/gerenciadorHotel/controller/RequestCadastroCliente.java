package br.com.gerenciadorHotel.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.GregorianCalendar;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciadorHotel.modelo.BancoCliente;
import br.com.gerenciadorHotel.modelo.Cliente;
import br.com.gerenciadorHotel.modelo.DataManuseador;
import br.com.gerenciadorHotel.modelo.Endereco;

/**
 * Servlet implementation class RequestCadastroCliente
 */

@WebServlet("/requestCadastroCliente")
public class RequestCadastroCliente extends HttpServlet {
	
	private String nome;
	private String documento;
	private String data;
	private String estado;
	private String cidade;
	private String rua;
	private String numero;
	private String telefone;
	private String email;
	private String span;
	private DataManuseador dataManuseador;
	private GregorianCalendar dataNascimento = null;
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		nome = request.getParameter("nome");
		documento = request.getParameter("documento");
		data = request.getParameter("dataNascimento");
		estado = request.getParameter("estados-brasil");
		cidade = request.getParameter("cidade");
		rua = request.getParameter("rua");
		numero = request.getParameter("numero");
		telefone = request.getParameter("telefone");
		email = request.getParameter("email");
		span = request.getParameter("span");
		
		dataManuseador = new DataManuseador(data);
		dataNascimento = null;
		
		try {
			dataNascimento = dataManuseador.formatDate();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Endereco endereco = new Endereco(estado, cidade, rua, Integer.parseInt(numero));
		Cliente cliente = new Cliente(nome, endereco, documento, dataNascimento, telefone, email, Boolean.parseBoolean(span));
		
		BancoCliente bancoC = new BancoCliente();
		bancoC.adiciona(cliente);
		
		request.setAttribute("cliente", cliente.getNome());
		
		response.sendRedirect("ListaCliente");
	}

}
