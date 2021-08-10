package br.com.gerenciadorHotel.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.GregorianCalendar;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.gerenciadorHotel.modelo.*;

/**
 * Servlet implementation class RequestCadastroCliente
 */

@WebServlet("/requestCadastroReserva")
public class RequestCadastroReserva extends HttpServlet {
	
	private String identificacaoCliente;
	private String identificacaoAcomodacao;
	private String dataEntrada;
	private String dataSaida;
	private DataManuseador dataManuseador;
	private GregorianCalendar dataEntradaFormat = null;
	private GregorianCalendar dataSaidaFormat = null;
	private Cliente cliente;
	private Acomodacao acomodacao;
	private BancoCliente bancoC = new BancoCliente();
	private BancoAcomodacao bancoA = new BancoAcomodacao();
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		identificacaoCliente = request.getParameter("identificacaoCliente");
		identificacaoAcomodacao = request.getParameter("identificacaoAcomodacao");
		dataEntrada = request.getParameter("dataEntrada");
		dataSaida = request.getParameter("dataSaida");
		
		dataManuseador = new DataManuseador(dataEntrada);	
		
		try {
			dataEntradaFormat = dataManuseador.formatDate();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		dataManuseador = new DataManuseador(dataSaida);

		try {
			dataSaidaFormat = dataManuseador.formatDate();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		cliente = bancoC.buscaClientePeloDocumento(identificacaoCliente);
		acomodacao = bancoA.buscaAcomodacaoPeloId(Integer.parseInt(identificacaoAcomodacao));
		
		Reserva reserva = new Reserva(cliente, acomodacao, dataEntradaFormat, dataSaidaFormat);
		
		BancoReserva bancoR = new BancoReserva();
		bancoR.adiciona(reserva);
		
		request.setAttribute("reserva", reserva.getId());
		
		response.sendRedirect("listaReserva");
	}

}

