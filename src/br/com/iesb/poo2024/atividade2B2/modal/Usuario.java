package br.com.iesb.poo2024.atividade2B2.modal;

/**
 * Classe que representa um usuarios
 * */

import java.util.Objects;

import br.com.iesb.poo2024.atividade2B2.exceptions.usuarioExceptions.CpfInvalidoException;
import br.com.iesb.poo2024.atividade2B2.exceptions.usuarioExceptions.SenhaInvalidaException;
import br.com.iesb.poo2024.atividade2B2.exceptions.usuarioExceptions.UsuarioInvalidoException;

public class Usuario {

	private int id;
	private String usuario;
	private String senha;
	private String cpf;

	public Usuario() {
	}

	public Usuario(int id, String usuario, String senha, String cpf) {

		if (usuario == null || usuario.isBlank()) {
			throw new UsuarioInvalidoException("Usuario inválido, tente novamente.");
		}
		if (senha == null || senha.isBlank()) {
			throw new SenhaInvalidaException("Senha invalida, tente novamente.");
		}
		if (cpf == null || cpf.isBlank()) {
			throw new CpfInvalidoException("Cpf Invalido, tente novamente.");
		}

		this.id = id;
		this.usuario = usuario;
		this.senha = senha;
		this.cpf = cpf;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public String getSenha() {
		return senha;
	}

	public String getCpf() {
		return cpf;
	}
}
