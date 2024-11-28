package br.com.iesb.poo2024.atividade2B2.application;

import br.com.iesb.poo2024.atividade2B2.controller.CartaoControler;
import br.com.iesb.poo2024.atividade2B2.controller.UsuarioController;
import br.com.iesb.poo2024.atividade2B2.modal.Cartao;
import br.com.iesb.poo2024.atividade2B2.modal.Usuario;

/**
 * Método principal para execução da aplicação
 */
public class Main {
	public static void main(String[] args) {

		System.out.println("======== Gabriel Rodrigues de Oliveira - 2312130033 ========");
		// Instanciação do controler gerenciador de operações
		UsuarioController usuarioControler = new UsuarioController();
		CartaoControler cartaoControler = new CartaoControler();

		// Cria um objeto Usuario
		Usuario gabriel = new Usuario(0, "Gabriel", "123456", "01234567891");

		// Chama o método do controlador para armazenar o objeto
		usuarioControler.criaUsuario(gabriel);

		// Cria um objeto Cartao e associa ao Usuario
		Cartao cartao = new Cartao(0, "Nubank", 1234214L, 3232, gabriel);

		// Chama o método do controlador para armazenar o objeto
		cartaoControler.criaCartao(cartao);

		// Chama um metodo de confiramação de pagamento
		cartaoControler.confirmarPagamento(cartao, true); // Pagamento realizado
		cartaoControler.confirmarPagamento(cartao, false); // Pagamento não realizado

	}
}
