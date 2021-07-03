package br.com.hotel.modelo;

public class Quarto {

	private String tipoQuarto;
	private double valorDiaria;
	private Cliente cliente;
	
	public Quarto(String tipoQuarto, double valorDiaria) {
		this.tipoQuarto = tipoQuarto;
		this.valorDiaria = valorDiaria;
		this.cliente = null;
	}
	
	public String getTipoQuarto(String tipoQuarto) {
		return this.tipoQuarto = tipoQuarto;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
