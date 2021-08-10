package br.com.gerenciadorHotel.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BancoCliente {

	private static List<Cliente> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	public void adiciona(Cliente cliente) {
		cliente.setId(BancoCliente.chaveSequencial++);
		BancoCliente.lista.add(cliente);
	}
	
	public List<Cliente> getClientes() {
		return BancoCliente.lista;
	}
	
	public void removeCliente(Integer id) {
		
		Iterator<Cliente> it = lista.iterator();
		
		while(it.hasNext()) {
			Cliente cliente = it.next();
			
			if(cliente.getId() == id) {
				it.remove();
			}
		}
	}

	public Cliente buscaClientePeloId(Integer id) {
		for (Cliente cliente : lista) {
			if(cliente.getId() == id) {
				return cliente;
			}
		}
		return null;
	}
	
	public Cliente buscaClientePeloDocumento(String documento) {
		for (Cliente cliente : lista) {
			if(cliente.getCpf().contentEquals(documento)) {
				return cliente;
			}
		}
		return null;
	}

}
