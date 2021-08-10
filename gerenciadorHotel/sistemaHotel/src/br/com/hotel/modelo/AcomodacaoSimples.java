package br.com.hotel.modelo;

public class AcomodacaoSimples extends Acomodacao {

	private boolean frigobar = false;
	private boolean banheira = false;
	private boolean canaisAdicionais = false;
	
	public AcomodacaoSimples(String nomeAcomodacao, int valorDiaria, int quantidadePessoasPermitida) {
		super(nomeAcomodacao, valorDiaria, quantidadePessoasPermitida);
	}
	
}
