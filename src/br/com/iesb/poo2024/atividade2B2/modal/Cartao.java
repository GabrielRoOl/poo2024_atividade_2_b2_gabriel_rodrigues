package br.com.iesb.poo2024.atividade2B2.modal;
/**
 * Classe que representa um cartão bancário
 * */
import java.util.Objects;

import br.com.iesb.poo2024.atividade2B2.exceptions.cartaoExceptions.NomeInvalidoException;
import br.com.iesb.poo2024.atividade2B2.exceptions.cartaoExceptions.UsuarioCartaoInvalidoException;
import br.com.iesb.poo2024.atividade2B2.interfaces.Pagamento;
import br.com.iesb.poo2024.atividade2B2.service.UsuarioService;

public class Cartao extends Pagamento {

	private int id;
	private String nome;
	private Long numero;
	private int cvv;
	
	private Usuario usuario;


	public Cartao(int id, String nome, Long numero, int cvv, Usuario usuario) {
		if(nome.isBlank() || nome == null) {
			throw new NomeInvalidoException("Digite um nome valido.");
		}
		if(usuario == null) {
			throw new UsuarioCartaoInvalidoException("Não foi encontrado esse usuário.");
		}
		this.id = id;
		this.nome = nome;
		this.numero = numero;
		this.cvv = cvv;
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Long getNumero() {
		return numero;
	}

	public int getCvv() {
		return cvv;
	}
		
}
