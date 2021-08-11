package testes;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.gerenciadorHotel.modelo.*;

class TesteReserva {
	
	private Endereco endereco;
	private GregorianCalendar date;
	private Cliente cliente;
	private AcomodacaoSimples acomodacaoSimples;
	private AcomodacaoLuxo acomodacaoLuxo;
	private GregorianCalendar dataEntrada;
	private GregorianCalendar dataSaida;
	
	@BeforeEach
	void testReserva01() {
		endereco = new Endereco("SP", "St. André", "Rua Cabral", 50);
		date = new GregorianCalendar(1996, 04, 21);
		cliente = new Cliente("Gabriel", endereco, "99999999999", date, "11912345678", "gabriel@email.com", true);
		acomodacaoSimples = new AcomodacaoSimples("Quarto Sol", Float.parseFloat("500.0"), "Bem aconchegante!");
		acomodacaoLuxo = new AcomodacaoLuxo("Quarto Lua", Float.parseFloat("1000.0"), "Bem grande!");
		dataEntrada = new GregorianCalendar(2022, 03, 22);
		dataSaida = new GregorianCalendar(2022, 03, 28);
		
	}

	
	@Test
	void testReserva02() {
		Reserva reserva = new Reserva(cliente, acomodacaoSimples, dataEntrada, dataSaida);
		assertEquals("Quarto Sol",reserva.getAcomodacao().getNome());
		assertEquals(6, reserva.getDuracaoReserva());
		assertEquals(3000.0, reserva.getValorReserva(), 0);
		assertEquals("Gabriel", reserva.getCliente().getNome());
	}
	
	@Test
	void testReserva03() {
		Reserva reserva = new Reserva(cliente, acomodacaoLuxo, dataEntrada, dataSaida);
		assertEquals("Quarto Lua",reserva.getAcomodacao().getNome());
		assertEquals(6, reserva.getDuracaoReserva());
		assertEquals(6000.0, reserva.getValorReserva(), 0);
		assertEquals("Gabriel", reserva.getCliente().getNome());
	}
	
}
