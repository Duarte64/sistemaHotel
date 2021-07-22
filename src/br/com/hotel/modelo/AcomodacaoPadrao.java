package br.com.hotel.modelo;

public class AcomodacaoPadrao extends Acomodacao implements ServicosAdicionais {
	
	private boolean frigobar = true;
	private boolean canaisAdicionais = true;
	private boolean banheira = false;
	
	public AcomodacaoPadrao(String nomeAcomodacao, int valorDiaria, int quantidadePessoasPermitidas) {
		super(nomeAcomodacao, valorDiaria, quantidadePessoasPermitidas);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String enviaRefeicao() {
		return "Refeição enviada para acomodação (Padrão) com sucesso!";
	}
	
	@Override
	public boolean servicoQuarto() {
		//TALVEZ IMPLEMENTAR ALGUM MÉTODO (?)
		return true;
	}

}
