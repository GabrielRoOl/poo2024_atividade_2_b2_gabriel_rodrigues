package br.com.iesb.poo2024.atividade2B2.interfaces;

/**
 * Classe que implementa a interface IPagamento, fornecendo uma implementação
 * básica para os métodos relacionaos ao processo de pagamento.
 */
public class Pagamento implements IPagamento {

	@Override
	public boolean pagamentoRealizado(boolean b) {
		return b;
	}

	@Override
	public void notaFiscal() {
		System.out.println("Gerando nota fiscal...");
	}

}
