package br.com.hotel.modelo;

public class Endereco {
	
	private String unidadeFederativa;
	private String cidade;
	private String bairro;
	private String rua;
	private int numero;
	
	public Endereco (String unidadeFederativa, String cidade, String bairro, String rua, int numero) {
		this.unidadeFederativa = unidadeFederativa;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return this.unidadeFederativa + " - " + this.cidade + 
				"\n" + this.bairro + ", " + this.rua + " Nº" + this.numero ;
	}
}
