package br.com.hotel.modelo;

import java.util.Date;

public class Cliente {
	
	private String nome;
	private String documento;
	private String telContato;
	private String email;
	private Date dataNasc;
	
	public Cliente(String nome, String documento, String telContato, String email) {
		this.nome = nome;
		this.documento = documento;
		this.telContato = telContato;
		this.email = email;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getTelContato() {
		return this.telContato;
	}
	
	public String gelEmail() {
		return this.email;
	}
	
}
