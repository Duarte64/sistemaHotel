package testes;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

import br.com.gerenciadorHotel.modelo.*;

class TesteCliente {
	
	public Endereco endereco = new Endereco("SP", "St. André", "Rua Cabral", 50);
	public GregorianCalendar date = new GregorianCalendar(1996, 04, 21);
	public Cliente cliente;
	
	@Test
	void testSetCliente() {
		cliente = new Cliente("Gabriel", endereco, "99999999999", date, "11912345678", "gabriel@email.com", true);
		assertEquals("Gabriel", cliente.getNome());
		assertEquals("11912345678", cliente.getTelefone());
		assertEquals("gabriel@email.com", cliente.getEmail());
		assertEquals("Gabriel - 25 anos.", cliente.toString());
	}

	
	@Test
	void testIdade01() {
		cliente = new Cliente("Gabriel", endereco, "99999999999", date, "11912345678", "gabriel@email.com", true);
		assertEquals(25, cliente.getIdade());
	}
	
	@Test
	void testIdade02() {
		date = new GregorianCalendar(1996, 10, 21);
		cliente = new Cliente("Gabriel", endereco, "99999999999", date, "11912345678", "gabriel@email.com", true);
		assertEquals(24, cliente.getIdade());
	}
	
	@Test
	void testEndereco01() {
		assertEquals("SP - St. André\nRua Cabral Nº50", endereco.toString());
	}
	
	@Test
	void testEndereco02() {
		cliente = new Cliente("Gabriel", endereco, "99999999999", date, "11912345678", "gabriel@email.com", true);
		assertEquals("SP - St. André\nRua Cabral Nº50", cliente.getEndereco());
	}

}
