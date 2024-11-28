package br.com.iesb.poo2024.atividade2B2.exceptions.usuarioExceptions;
/**
 * Exceção personalizada para tratar casos de CPF inválidos
 * */
public class CpfInvalidoException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public CpfInvalidoException(String msg) {
		System.out.println(msg);
	}
}
