package br.com.iesb.poo2024.atividade2B2.exceptions.usuarioExceptions;
/**
 * Exceção personalizada para tratar casos de Senha inválidos
 * */
public class SenhaInvalidaException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public SenhaInvalidaException(String msg) {
		System.out.println(msg);
	}
	
}
