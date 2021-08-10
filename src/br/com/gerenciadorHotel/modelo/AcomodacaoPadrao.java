package br.com.gerenciadorHotel.modelo;

public class AcomodacaoPadrao extends Acomodacao implements ServicosAdicionais {
	
	public AcomodacaoPadrao(String nomeAcomodacao, float valorDiaria, String descricao) {
		super(nomeAcomodacao, valorDiaria, descricao);
		this.tipo = "Acomoda��o Padr�o";
		this.frigobar = true;
		this.canaisAdicionais = true;
		this.banheira = true;
	}
	
	@Override
	public String enviaRefeicao() {
		return "Refei��o enviada para acomoda��o (Padr�o) com sucesso!";
	}
	
	@Override
	public String servicoQuarto() {
		return "Servico de quarto de n�vel padr�o enviado para a acomoda��o!";
	}

}