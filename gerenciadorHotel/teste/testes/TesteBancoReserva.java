package testes;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.gerenciadorHotel.modelo.Acomodacao;
import br.com.gerenciadorHotel.modelo.AcomodacaoLuxo;
import br.com.gerenciadorHotel.modelo.BancoReserva;
import br.com.gerenciadorHotel.modelo.Cliente;
import br.com.gerenciadorHotel.modelo.Endereco;
import br.com.gerenciadorHotel.modelo.Reserva;

class TesteBancoReserva {

	private Endereco endereco;
	private GregorianCalendar date;
	private Cliente cliente;
	private Acomodacao acomodacao;
	private BancoReserva bancoReserva;
	private GregorianCalendar dataEntrada;
	private GregorianCalendar dataSaida;
	private Reserva reserva;
	
	@BeforeEach
	void testReserva01() {
		endereco = new Endereco("SP", "St. André", "Rua Cabral", 50);
		date = new GregorianCalendar(1996, 04, 21);
		cliente = new Cliente("Gabriel", endereco, "99999999999", date, "11912345678", "gabriel@email.com", true);
		acomodacao = new AcomodacaoLuxo("Quarto Ondas", Float.parseFloat("1000"), "Bonito");
		dataEntrada = new GregorianCalendar(2022, 03, 20);
		dataSaida = new GregorianCalendar(2022, 03, 28);
		bancoReserva = new BancoReserva();
		reserva = new Reserva(cliente, acomodacao, dataEntrada, dataSaida);
	}

	
	@Test
	void testBancoReservaStep1() {
		bancoReserva.adiciona(reserva);
		List<Reserva> reservas = bancoReserva.getReservas();
		Reserva reservaTest = reservas.get(0);
		assertEquals(reserva, reservaTest);
	}
	
	
	
}
