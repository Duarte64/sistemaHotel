package br.com.gerenciadorHotel.modelo;

public class AcomodacaoPadrao extends Acomodacao implements ServicosAdicionais {
	
	public AcomodacaoPadrao(String nomeAcomodacao, float valorDiaria, String descricao) {
		super(nomeAcomodacao, valorDiaria, descricao);
		this.tipo = "Acomodação Padrão";
		this.frigobar = true;
		this.canaisAdicionais = true;
		this.banheira = true;
	}
	
	@Override
	public String enviaRefeicao() {
		return "Refeição enviada para acomodação (Padrão) com sucesso!";
	}
	
	@Override
	public String servicoQuarto() {
		return "Servico de quarto de nível padrão enviado para a acomodação!";
	}

}