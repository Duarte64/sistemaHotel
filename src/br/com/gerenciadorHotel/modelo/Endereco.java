package br.com.gerenciadorHotel.modelo;

public class Endereco {
	
	private String unidadeFederativa;
	private String cidade;
	private String rua;
	private int numero;
	
	public Endereco (String unidadeFederativa, String cidade, String rua, int numero) {
		this.unidadeFederativa = unidadeFederativa;
		this.cidade = cidade;
		this.rua = rua;
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return this.unidadeFederativa + " - " + this.cidade + 
				"\n" + this.rua + " Nº" + this.numero ;
	}
}
