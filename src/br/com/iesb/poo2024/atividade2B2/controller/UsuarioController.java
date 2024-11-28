package br.com.iesb.poo2024.atividade2B2.controller;

import br.com.iesb.poo2024.atividade2B2.exceptions.cartaoExceptions.NomeInvalidoException;
import br.com.iesb.poo2024.atividade2B2.exceptions.usuarioExceptions.CpfInvalidoException;
import br.com.iesb.poo2024.atividade2B2.exceptions.usuarioExceptions.SenhaInvalidaException;
import br.com.iesb.poo2024.atividade2B2.modal.Usuario;
import br.com.iesb.poo2024.atividade2B2.service.UsuarioService;
/**
 * Classe responsável por controlar as operações relacionadas a Usuario
 */
public class UsuarioController {

	// Serviço responsável pelas operações em Usuario.
	private UsuarioService usuarioService = new UsuarioService();

	// Cria um novo usuário utilizando os dados fornecidos e delega a lógica ao
	// serviço.
	public Usuario criaUsuario(int id, String usuario, String senha, String cpf) {
		try {
			return usuarioService.criaUsuario(id, usuario, senha, cpf);

		} catch (NomeInvalidoException | SenhaInvalidaException | CpfInvalidoException e) {
			System.err.println("Erro ao criar usuário: " + e.getMessage());
			return null; // retorna null caso encontre exceções.
		}
	}

	// Sobrecarga de contrutor
	public void criaUsuario(Usuario usuario) {
		// Valida e delega a criação do usuário utilizando os dados do objeto
		criaUsuario(usuario.getId(), usuario.getUsuario(), usuario.getSenha(), usuario.getCpf());

	}

}
