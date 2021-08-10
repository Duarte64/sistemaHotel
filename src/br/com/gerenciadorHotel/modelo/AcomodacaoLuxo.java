package br.com.gerenciadorHotel.modelo;

public class AcomodacaoLuxo extends Acomodacao implements ServicosAdicionais {
	
	public AcomodacaoLuxo(String nomeAcomodacao, float valorDiaria, String descricao) {
		super(nomeAcomodacao, valorDiaria, descricao);
		this.tipo = "Acomodação de Luxo";
		this.banheira = true;
		this.canaisAdicionais = true;
		this.frigobar = true;
	}
	
	public String servicoPraia() {
		return "Serviço de praia enviado para o quarto com sucesso!";
	}
	
	@Override
	public String enviaRefeicao() {
		return "Refeição enviada para acomodação(Luxo) com sucesso!";
	}
	
	@Override
	public String servicoQuarto() {
		return "Serviço de quarto de nível luxo enviado para acomodação!";
	}
	
}
