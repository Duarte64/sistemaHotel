package br.com.gerenciadorHotel.modelo;

public abstract class Acomodacao {
	
	private Integer id;
	private String nomeAcomodacao;
	private float valorDiaria;
	private String descricao;
	protected String tipo;
	protected boolean banheira;
	protected boolean canaisAdicionais;
	protected boolean frigobar;
	
	public Acomodacao(String nomeAcomodacao, float valorDiaria, String descricao) {
		this.nomeAcomodacao = nomeAcomodacao;
		this.valorDiaria = valorDiaria;
		this.descricao = descricao;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nomeAcomodacao;
	}
	
	public float getDiaria() {
		return this.valorDiaria;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "" + this.getNome() + "\nValor Diária: " + this.getDiaria();
	}
		
}