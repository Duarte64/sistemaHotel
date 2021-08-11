package testes;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.gerenciadorHotel.modelo.*;

class TesteAcomodacao {
	
	private AcomodacaoSimples acomodacaoSimples;
	private AcomodacaoPadrao acomodacaoPadrao;
	private AcomodacaoLuxo acomodacaoLuxo;
	
	
	@Test
	void testSimples() {
		acomodacaoSimples = new AcomodacaoSimples("Quarto Sol", Float.parseFloat("500.0"), "Bem aconchegante!");
		assertEquals(500.0, acomodacaoSimples.getDiaria(), 0);
		assertEquals("Quarto Sol", acomodacaoSimples.getNome());
		assertEquals("Bem aconchegante!", acomodacaoSimples.getDescricao());
		assertEquals("Acomoda��o Simples", acomodacaoSimples.getTipo());
	}
	
	@Test
	void testPadrao() {
		acomodacaoPadrao = new AcomodacaoPadrao("Quarto Lua", Float.parseFloat("650.0"), "Cama grande, com canais adicionais e frigobar.");
		assertEquals(650.0, acomodacaoPadrao.getDiaria(), 0);
		assertEquals("Quarto Lua", acomodacaoPadrao.getNome());
		assertEquals("Cama grande, com canais adicionais e frigobar.", acomodacaoPadrao.getDescricao());
		assertEquals("Acomoda��o Padr�o", acomodacaoPadrao.getTipo());
		assertEquals("Refei��o enviada para acomoda��o (Padr�o) com sucesso!", acomodacaoPadrao.enviaRefeicao());
		assertEquals("Servico de quarto de n�vel padr�o enviado para a acomoda��o!", acomodacaoPadrao.servicoQuarto());
	}
	
	@Test
	void testLuxo() {
		acomodacaoLuxo = new AcomodacaoLuxo("Quarto Som do Mar", Float.parseFloat("1000.0"), "Melhor quarto do Hotel com vista para o Mar e do Nascer do Sol.");
		assertEquals(1000.0, acomodacaoLuxo.getDiaria(), 0);
		assertEquals("Quarto Som do Mar", acomodacaoLuxo.getNome());
		assertEquals("Melhor quarto do Hotel com vista para o Mar e do Nascer do Sol.", acomodacaoLuxo.getDescricao());
		assertEquals("Acomoda��o de Luxo", acomodacaoLuxo.getTipo());
		assertEquals("Refei��o enviada para acomoda��o (Luxo) com sucesso!", acomodacaoLuxo.enviaRefeicao());
		assertEquals("Servi�o de quarto de n�vel luxo enviado para acomoda��o!", acomodacaoLuxo.servicoQuarto());
		assertEquals("Servi�o de praia enviado para o quarto com sucesso!", acomodacaoLuxo.servicoPraia());
	}

	
}
