package br.com.iesb.poo2024.atividade2B2.exceptions.cartaoExceptions;
/**
 * Exceção personalizada para tratar casos de nomes inválidos
 * */
public class NomeInvalidoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NomeInvalidoException(String msg) {
		System.out.println(msg);
	}
}
