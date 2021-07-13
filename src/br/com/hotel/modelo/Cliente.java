package br.com.hotel.modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Cliente {

	private String nome;
	private Endereco endereco;
	private String cpf;
	private GregorianCalendar dataNascimento;
	private String telefone;
	private String email;
	
	public Cliente(String nome, String sexo, Endereco endereco, String cpf, GregorianCalendar dataNascimento, String telefone, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco.toString();
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public int getIdade() {
		Calendar calendar = new GregorianCalendar();
		if (calendar.get(Calendar.DAY_OF_YEAR) <= this.dataNascimento.get(Calendar.DAY_OF_YEAR)) {
			return (calendar.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR))-1;
		} else {
			return calendar.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
		}
	}
	
	@Override
	public String toString() {
		return this.getNome() + " - " + this.getIdade() + " anos.";
	}
	
}
