package br.com.hotel.modelo;

public class AcomodacaoPadrao extends Acomodacao implements ServicosAdicionais {
	

	public AcomodacaoPadrao(String nomeAcomodacao, int valorDiaria) {
		super(nomeAcomodacao, valorDiaria);
		// TODO Auto-generated constructor stub
	}
	
	private boolean banheira = false;
	private boolean canaisAdicionais = true;
	
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
