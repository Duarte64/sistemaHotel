package br.com.gerenciadorHotel.modelo;

public class AcomodacaoSimples extends Acomodacao {
	
	public AcomodacaoSimples(String nomeAcomodacao, float valorDiaria, String descricao) {
		super(nomeAcomodacao, valorDiaria, descricao);
		this.tipo = "Acomoda��o Simples";
		this.frigobar = false;
		this.banheira = false;
		this.canaisAdicionais = false;
	}
	
}
