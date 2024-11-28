package br.com.iesb.poo2024.atividade2B2.exceptions.cartaoExceptions;
/**
 * Exceção personalizada para tratar casos de cartão de usuario inválidos
 * */
public class UsuarioCartaoInvalidoException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public UsuarioCartaoInvalidoException(String msg) {
		super(msg);
	}

}
