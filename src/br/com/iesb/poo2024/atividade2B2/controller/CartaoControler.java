package br.com.iesb.poo2024.atividade2B2.controller;

import br.com.iesb.poo2024.atividade2B2.exceptions.cartaoExceptions.UsuarioCartaoInvalidoException;
import br.com.iesb.poo2024.atividade2B2.exceptions.usuarioExceptions.UsuarioInvalidoException;
import br.com.iesb.poo2024.atividade2B2.modal.Cartao;
import br.com.iesb.poo2024.atividade2B2.modal.Usuario;
import br.com.iesb.poo2024.atividade2B2.service.PagamentoCartaoService;
import br.com.iesb.poo2024.atividade2B2.service.UsuarioService;

/**
 * Classe responsável por controlar as operações relacionadas a Cartões
 */
public class CartaoControler {

	// Serviço responsável por realizar operações relacionadas a Cartões
	private PagamentoCartaoService pagamentoCartaoService = new PagamentoCartaoService();

	// Construtor
	public Cartao criaCartao(int id, String nome, Long numero, int cvv, Usuario usuario) {
		try {
			return pagamentoCartaoService.criaCartao(id, nome, numero, cvv, usuario);

		} catch (UsuarioCartaoInvalidoException | UsuarioInvalidoException e) {
			System.err.println("Erro ao criar cartão: " + e.getMessage());
			return null; // retorna null caso ocorra alguma exceção
		}
	}

	// Sobrecarga de construtor
	public void criaCartao(Cartao card) {
		// Obtém as informações do cartão para validação
		criaCartao(card.getId(), card.getNome(), card.getNumero(), card.getCvv(), card.getUsuario());

	}

	// Confirma o pagamento de um cartão
	public void confirmarPagamento(Cartao cartao, boolean pagamento) {
		if (pagamento == true) {
			System.out.println("Pagamento realizado com sucesso.");
			cartao.notaFiscal();
		} else {
			System.out.println("Pagamento não autorizado.");
		}

	}

}
