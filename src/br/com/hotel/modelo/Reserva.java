package br.com.hotel.modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Reserva {
	
	public int numIdentificacao;
	private Cliente cliente;
	private Acomodacao acomodacao;
	private GregorianCalendar dataEntrada;
	private GregorianCalendar dataSaida;
	
	public int getDuracaoReserva() {
		if (this.dataEntrada.get(Calendar.MONTH) == this.dataSaida.get(Calendar.MONTH)) {
			return this.dataSaida.get(Calendar.DAY_OF_MONTH) - this.dataEntrada.get(Calendar.DAY_OF_MONTH);
		} else {
			return Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH) - this.dataEntrada.get(Calendar.DAY_OF_MONTH) + this.dataSaida.get(Calendar.DAY_OF_MONTH);
		}
	}
	
	public double getValorReserva() {
		return getDuracaoReserva()*this.acomodacao.getValorDiaria();
	}
	
}
