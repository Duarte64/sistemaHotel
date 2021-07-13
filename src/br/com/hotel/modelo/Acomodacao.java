package br.com.hotel.modelo;

import java.util.Calendar;
import java.util.Date;

public abstract class Acomodacao {
	
	private String nomeAcomodacao;
	private int valorDiaria;
	private Cliente cliente;
	private Date dataEntrada;
	private Date dataSaida;
	
	public Acomodacao(String nomeAcomodacao, int valorDiaria) {
		this.nomeAcomodacao = nomeAcomodacao;
		this.valorDiaria = valorDiaria;
		this.cliente = null;
		this.dataEntrada = null;
		this.dataSaida = null;
	}
	
	private void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	private void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
	private void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	public double getValorReserva() {
		//IMPLEMENTAR MÉTODO
		return 2.0;
	}
	
	public boolean realizarReserva(Cliente cliente, Calendar dataEntrada, Calendar dataSaida) {
		//IMPLEMENTAR MÉTODO
		if (true) {
			return true;
		} else {
			return false;
		}
	}
	
}
