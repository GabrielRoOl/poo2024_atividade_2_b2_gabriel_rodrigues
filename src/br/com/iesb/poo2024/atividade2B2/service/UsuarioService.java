package br.com.iesb.poo2024.atividade2B2.service;

import br.com.iesb.poo2024.atividade2B2.modal.Usuario;

public class UsuarioService {
	
	public Usuario criaUsuario(int id, String usuario, String senha, String cpf) {
		return new Usuario(id, usuario, senha, cpf);
	}
}
