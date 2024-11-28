package br.com.iesb.poo2024.atividade2B2.service;

import br.com.iesb.poo2024.atividade2B2.modal.Cartao;
import br.com.iesb.poo2024.atividade2B2.modal.Usuario;

public class PagamentoCartaoService {

	public Cartao criaCartao(int id, String nome, Long numero, int cvv, Usuario usuario) {
		return new Cartao(id, nome, numero, cvv, usuario);
	}
	
}
