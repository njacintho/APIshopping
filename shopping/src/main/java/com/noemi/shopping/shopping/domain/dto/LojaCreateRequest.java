package com.noemi.shopping.shopping.domain.dto;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class LojaCreateRequest {
	
	@NotEmpty(message = "O nome precisa ser informado")
	private String nome;
	
	@NotEmpty(message = "O segmento precisa ser informado")
	private String segmento;
	
	

}
