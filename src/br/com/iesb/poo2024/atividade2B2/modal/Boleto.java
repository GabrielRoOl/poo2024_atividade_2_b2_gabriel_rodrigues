package br.com.iesb.poo2024.atividade2B2.modal;

import br.com.iesb.poo2024.atividade2B2.interfaces.Pagamento;
/**
 * Classe que representa um boleto bancário
 * */
public class Boleto extends Pagamento {

	public String gerarCodigoBarras() {
	    return "00190.00009 12345.678901 23456.789012 3 87650000010000"; 
	}


}
