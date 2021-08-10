package br.com.gerenciadorHotel.modelo;

import java.util.ArrayList;
import java.util.List;

public class BancoReserva {
	
	private static List<Reserva> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	public void adiciona(Reserva reserva) {
		reserva.setId(BancoReserva.chaveSequencial++);
		BancoReserva.lista.add(reserva);
	}
	
	public List<Reserva> getReservas() {
		return BancoReserva.lista;
	}

}
