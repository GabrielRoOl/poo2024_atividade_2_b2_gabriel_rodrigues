package br.com.iesb.poo2024.atividade2B2.controller;

import br.com.iesb.poo2024.atividade2B2.modal.Pix;

public class PixController {
	
	public Pix criaPix(int id, String chave) {
		return new Pix(id, chave);
	}

}
