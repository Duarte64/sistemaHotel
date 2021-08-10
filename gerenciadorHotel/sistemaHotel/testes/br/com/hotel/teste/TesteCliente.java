package br.com.hotel.teste;

import static org.junit.jupiter.api.Assertions.*;

import java.util.GregorianCalendar;
 
import org.junit.jupiter.api.Test;

import br.com.hotel.modelo.Cliente;
import br.com.hotel.modelo.Endereco;

class testeCliente {
	
	public Endereco endereco = new Endereco("SP", "St. André", "Centro", "Rua 01", 01);
	public GregorianCalendar date = new GregorianCalendar(1996, 04, 21);;
	public Cliente cliente;
	
	@Test
	void testSetCliente() {
		cliente = new Cliente("Gabriel", "M", endereco, "99999999999", date, "11912345678", "gabriel@email.com");
		assertEquals("Gabriel", cliente.getNome());
		assertEquals("11912345678", cliente.getTelefone());
		assertEquals("gabriel@email.com", cliente.getEmail());
		assertEquals("Gabriel - 25 anos.", cliente.toString());
	}

	
	@Test
	void testIdade01() {
		cliente = new Cliente("Gabriel", "M", endereco, "99999999999", date, "11912345678", "gabriel@email.com");
		assertEquals(25, cliente.getIdade());
	}
	
	@Test
	void testIdade02() {
		date = new GregorianCalendar(1996, 10, 21);
		Cliente cliente = new Cliente("Gabriel", "M", endereco, "99999999999", date, "11912345678", "gabriel@email.com");
		assertEquals(24, cliente.getIdade());
	}
	
	@Test
	void testEndereco01() {
		assertEquals("SP - St. André\nCentro, Rua 01 Nº1", endereco.toString());
	}
	
	@Test
	void testEndereco02() {
		cliente = new Cliente("Gabriel", "M", endereco, "99999999999", date, "11912345678", "gabriel@email.com");
		assertEquals("SP - St. André\nCentro, Rua 01 Nº1", cliente.getEndereco());
	}

}
