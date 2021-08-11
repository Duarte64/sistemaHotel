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
		assertEquals("Acomodação Simples", acomodacaoSimples.getTipo());
	}
	
	@Test
	void testPadrao() {
		acomodacaoPadrao = new AcomodacaoPadrao("Quarto Lua", Float.parseFloat("650.0"), "Cama grande, com canais adicionais e frigobar.");
		assertEquals(650.0, acomodacaoPadrao.getDiaria(), 0);
		assertEquals("Quarto Lua", acomodacaoPadrao.getNome());
		assertEquals("Cama grande, com canais adicionais e frigobar.", acomodacaoPadrao.getDescricao());
		assertEquals("Acomodação Padrão", acomodacaoPadrao.getTipo());
		assertEquals("Refeição enviada para acomodação (Padrão) com sucesso!", acomodacaoPadrao.enviaRefeicao());
		assertEquals("Servico de quarto de nível padrão enviado para a acomodação!", acomodacaoPadrao.servicoQuarto());
	}
	
	@Test
	void testLuxo() {
		acomodacaoLuxo = new AcomodacaoLuxo("Quarto Som do Mar", Float.parseFloat("1000.0"), "Melhor quarto do Hotel com vista para o Mar e do Nascer do Sol.");
		assertEquals(1000.0, acomodacaoLuxo.getDiaria(), 0);
		assertEquals("Quarto Som do Mar", acomodacaoLuxo.getNome());
		assertEquals("Melhor quarto do Hotel com vista para o Mar e do Nascer do Sol.", acomodacaoLuxo.getDescricao());
		assertEquals("Acomodação de Luxo", acomodacaoLuxo.getTipo());
		assertEquals("Refeição enviada para acomodação (Luxo) com sucesso!", acomodacaoLuxo.enviaRefeicao());
		assertEquals("Serviço de quarto de nível luxo enviado para acomodação!", acomodacaoLuxo.servicoQuarto());
		assertEquals("Serviço de praia enviado para o quarto com sucesso!", acomodacaoLuxo.servicoPraia());
	}

	
}
