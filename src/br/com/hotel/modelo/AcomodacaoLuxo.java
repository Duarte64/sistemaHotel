package br.com.hotel.modelo;

public class AcomodacaoLuxo extends Acomodacao implements ServicosAdicionais {

	public AcomodacaoLuxo(String nomeAcomodacao, int valorDiaria, int quantidadePessoasPermitida) {
		super(nomeAcomodacao, valorDiaria, quantidadePessoasPermitida);
		// TODO Auto-generated constructor stub
	}
	
	private boolean banheira = true;
	private boolean canaisAdicionais = true;
	private boolean frigobar = true;
	
	public String servicoPraia() {
		return "Servi�o de praia enviado para o quarto com sucesso!";
	}
	
	@Override
	public String enviaRefeicao() {
		return "Refei��o enviada para acomoda��o(Luxo) com sucesso!";
	}
	
	@Override
	public boolean servicoQuarto() {
		//TALVEZ IMPLEMENTAR ALGUM M�TODO (?)
		return true;
	}
	
}
