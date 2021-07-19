package br.com.hotel.modelo;

import br.com.hotel.modelo.Cliente;

public class AcomodacaoLuxo extends Acomodacao implements ServicosAdicionais {

	public AcomodacaoLuxo(String nomeAcomodacao, int valorDiaria) {
		super(nomeAcomodacao, valorDiaria);
		// TODO Auto-generated constructor stub
	}
	
	private boolean banheira = true;
	private boolean canaisAdicionais = true;
	private boolean frigobar = true;
	
	@Override
	public String enviaRefeicao() {
		return "Refeição enviada para acomodação(Luxo) com sucesso!";
	}
	
	@Override
	public boolean servicoQuarto() {
		//TALVEZ IMPLEMENTAR ALGUM MÉTODO (?)
		return true;
	}
	
	public String servicoPraia() {
		return "Serviço de praia enviado para o quarto com sucesso!";
	}

}
