package br.com.iesb.poo2024.atividade2B2.modal;

import br.com.iesb.poo2024.atividade2B2.interfaces.Pagamento;

public class Pix extends Pagamento {

	private int id;
	private String chave;

	public Pix(int id, String chave) {
		if(chave.isEmpty() || chave.isBlank()) {
			System.out.println("Insira uma chave");
		}
		this.id = id;
		this.chave = chave;
	}
	
	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
