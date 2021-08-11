package testes;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.gerenciadorHotel.modelo.BancoCliente;
import br.com.gerenciadorHotel.modelo.Cliente;
import br.com.gerenciadorHotel.modelo.Endereco;

class TesteBancoCliente {
	
	private Endereco endereco;
	private GregorianCalendar date;
	private Cliente cliente;
	private Cliente cliente2;
	private Cliente cliente3;
	private BancoCliente bancoC;
	
	@BeforeEach
	void testReserva01() {
		endereco = new Endereco("SP", "St. André", "Rua Cabral", 50);
		date = new GregorianCalendar(1996, 04, 21);
		cliente = new Cliente("Gabriel", endereco, "99999999999", date, "11912345678", "gabriel@email.com", true);
		cliente2 = new Cliente("Felipe", endereco, "11111111111", date, "11999999999", "felipe@email.com", false);
		cliente3 = new Cliente("João", endereco, "44444444444", date, "11944444444", "joao@email.com", true);
		bancoC = new BancoCliente();
	}

	
	@Test
	void testBancoClienteStep1() {
		bancoC.adiciona(cliente);
		bancoC.adiciona(cliente2);
		Cliente clienteTest = bancoC.buscaClientePeloDocumento("11111111111");
		assertEquals(cliente2, clienteTest);
		Cliente clienteTest2 = bancoC.buscaClientePeloId(1);
		assertEquals(cliente, clienteTest2);
	}
	
	@Test
	void testBancoClienteStep2() {
		bancoC.removeCliente(2);
		Cliente clienteTest3 = bancoC.buscaClientePeloId(2);
		assertEquals(clienteTest3, null);
	}
	
	@Test
	void testBancoClienteStep3() {
		bancoC.adiciona(cliente3);
		bancoC.removeCliente(1);
		List<Cliente> retorno = bancoC.getClientes();
		assertEquals(retorno.get(0), cliente3);
	}
	
}
