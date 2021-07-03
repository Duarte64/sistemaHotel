package br.com.hotel.controle;

import br.com.hotel.modelo.*;

public class RegrasReserva {

	
	public void registraQuarto() {
		
	}
	
	public void registraCliente() {
		
	}
	
	public boolean reserva(Quarto quarto, Cliente cliente) {
		if (quarto.getCliente() == null) {
			quarto.setCliente(cliente);
		}
		return false;
	}
	
}
