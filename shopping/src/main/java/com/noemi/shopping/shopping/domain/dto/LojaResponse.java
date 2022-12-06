package com.noemi.shopping.shopping.domain.dto;

import com.noemi.shopping.shopping.domain.entity.Loja;

import lombok.Data;

@Data
public class LojaResponse {
	
	private int id;
	private String nome;
	private String segmento;
	
	
	public LojaResponse(Loja loja) {
		this.id = loja.getId();
		this.nome = loja.getNome();
	}

}
