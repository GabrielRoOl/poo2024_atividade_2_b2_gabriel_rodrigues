package br.com.iesb.poo2024.atividade2B2.exceptions.usuarioExceptions;
/**
 * Exceção personalizada para tratar casos de Usuario inválidos
 * */
public class UsuarioInvalidoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public UsuarioInvalidoException(String msg) {
		System.out.println(msg);
	}

}
