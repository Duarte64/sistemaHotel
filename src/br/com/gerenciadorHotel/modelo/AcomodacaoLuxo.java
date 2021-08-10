package br.com.gerenciadorHotel.modelo;

public class AcomodacaoLuxo extends Acomodacao implements ServicosAdicionais {
	
	public AcomodacaoLuxo(String nomeAcomodacao, float valorDiaria, String descricao) {
		super(nomeAcomodacao, valorDiaria, descricao);
		this.tipo = "Acomoda��o de Luxo";
		this.banheira = true;
		this.canaisAdicionais = true;
		this.frigobar = true;
	}
	
	public String servicoPraia() {
		return "Servi�o de praia enviado para o quarto com sucesso!";
	}
	
	@Override
	public String enviaRefeicao() {
		return "Refei��o enviada para acomoda��o(Luxo) com sucesso!";
	}
	
	@Override
	public String servicoQuarto() {
		return "Servi�o de quarto de n�vel luxo enviado para acomoda��o!";
	}
	
}
