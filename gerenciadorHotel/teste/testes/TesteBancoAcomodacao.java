package testes;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.gerenciadorHotel.modelo.*;

class TesteBancoAcomodacao {
	
	private Acomodacao acomodacao1;
	private Acomodacao acomodacao2;
	private Acomodacao acomodacao3;
	private BancoAcomodacao bancoA;
	
	@BeforeEach
	void testReserva01() {
		acomodacao1 = new AcomodacaoSimples("Quarto Sol", Float.parseFloat("250"), "Agradável");
		acomodacao2 = new AcomodacaoPadrao("Quarto Lua", Float.parseFloat("500"), "Bonito");
		acomodacao3 = new AcomodacaoLuxo("Quarto Ondas", Float.parseFloat("1000"), "Aconchegante");
		bancoA = new BancoAcomodacao();
	}

	
	@Test
	void testBancoAcomodacaoStep1() {
		bancoA.adiciona(acomodacao2);
		Acomodacao acomodacaoTest = bancoA.buscaAcomodacaoPeloId(1);
		assertEquals(acomodacao2, acomodacaoTest);
	}
	
	@Test
	void testBancoAcomodacaoStep2() {
		bancoA.adiciona(acomodacao1);
		bancoA.adiciona(acomodacao3);
		bancoA.removeAcomodacao(2);
		Acomodacao acomodacaoTest = bancoA.buscaAcomodacaoPeloId(2);
		assertEquals(acomodacaoTest, null);
	}
	
	@Test
	void testBancoAcomodacaoStep3() {
		List<Acomodacao> retorno = bancoA.getAcomodacoes();
		Acomodacao acomodacaoTest2 = retorno.get(0);
		Acomodacao acomodacaoTest3 = retorno.get(1);
		assertEquals(acomodacaoTest2, acomodacao2);
		assertEquals(acomodacaoTest3, acomodacao3);
	}
	
}
