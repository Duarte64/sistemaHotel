package br.com.gerenciadorHotel.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BancoAcomodacao {

	private static List<Acomodacao> lista = new ArrayList<>();
	
	private static Integer chaveSequencial = 1;
	
	public void adiciona(Acomodacao acomodacao) {
		acomodacao.setId(BancoAcomodacao.chaveSequencial++);
		BancoAcomodacao.lista.add(acomodacao);
	}
	
	public List<Acomodacao> getAcomodacoes() {
		return BancoAcomodacao.lista;
	}
	
	public void removeAcomodacao(Integer id) {
		
		Iterator<Acomodacao> it = lista.iterator();
		
		while(it.hasNext()) {
			Acomodacao acomodacao = it.next();
			
			if(acomodacao.getId() == id) {
				it.remove();
			}
		}
	}

	public Acomodacao buscaAcomodacaoPeloId(Integer id) {
		for (Acomodacao acomodacao : lista) {
			if(acomodacao.getId() == id) {
				return acomodacao;
			}
		}
		return null;
	}

}
