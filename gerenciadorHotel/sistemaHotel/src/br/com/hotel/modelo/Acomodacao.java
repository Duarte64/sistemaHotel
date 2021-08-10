package br.com.hotel.modelo;

public abstract class Acomodacao {
	
	private String nomeAcomodacao;
	private int valorDiaria;
	protected int quantidadePessoasPermitida;
	
	public Acomodacao(String nomeAcomodacao, int valorDiaria, int quantidadePessoasPermitida) {
		this.nomeAcomodacao = nomeAcomodacao;
		this.valorDiaria = valorDiaria;
		this.quantidadePessoasPermitida = quantidadePessoasPermitida;
	}
	
	public String getNome() {
		return this.nomeAcomodacao;
	}
	
	public int getValorDiaria() {
		return this.valorDiaria;
	}
	
	public void setPromocaoDiaria(int valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	
	/**
	public boolean registrarReserva(Cliente cliente, GregorianCalendar dataEntrada, GregorianCalendar dataSaida) {
		//Implementação validação se a data está vazia.
		this.setCliente(cliente);
		this.setDataEntrada(dataEntrada);
		this.setDataSaida(dataSaida);
		return true;
	}
	**/
	
	@Override
	public String toString() {
		return "" + this.getNome() + "\nValor Diária: " + this.getValorDiaria();
	}
		
}
