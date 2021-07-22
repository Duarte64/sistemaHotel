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
		return "Refei��o enviada para acomoda��o (Padr�o) com sucesso!";
	}
	
	@Override
	public boolean servicoQuarto() {
		//TALVEZ IMPLEMENTAR ALGUM M�TODO (?)
		return true;
	}

}
