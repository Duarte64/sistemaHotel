package br.com.gerenciadorHotel.modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Reserva {
	
	private int id;
	private Cliente cliente;
	private Acomodacao acomodacao;
	private GregorianCalendar dataEntrada;
	private GregorianCalendar dataSaida;
	
	public Reserva(Cliente cliente, Acomodacao acomodacao, GregorianCalendar dataEntrada, GregorianCalendar dataSaida) {
		this.cliente = cliente;
		this.acomodacao = acomodacao;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}
	
	public int getDuracaoReserva() {
		if (this.dataEntrada.get(Calendar.MONTH) == this.dataSaida.get(Calendar.MONTH)) {
			return this.dataSaida.get(Calendar.DAY_OF_MONTH) - this.dataEntrada.get(Calendar.DAY_OF_MONTH);
		} else {
			return Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH) - this.dataEntrada.get(Calendar.DAY_OF_MONTH) + this.dataSaida.get(Calendar.DAY_OF_MONTH);
		}
	}
	
	public double getValorReserva() {
		return getDuracaoReserva()*this.acomodacao.getDiaria();
	}
	
	public int getId() {
		return id;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public Acomodacao getAcomodacao() {
		return this.acomodacao;
	}
	
	public String getDataEntrada() {
		return this.dataEntrada.get(Calendar.DAY_OF_MONTH) + "/" + this.dataEntrada.get(Calendar.MONTH) + "/" + this.dataEntrada.get(Calendar.YEAR);
	}
	
	public String getDataSaida() {
		return this.dataSaida.get(Calendar.DAY_OF_MONTH) + "/" + this.dataSaida.get(Calendar.MONTH) + "/" + this.dataSaida.get(Calendar.YEAR);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
}
