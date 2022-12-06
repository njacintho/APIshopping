package com.noemi.shopping.shopping.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.noemi.shopping.shopping.domain.dto.LojaCreateRequest;
import com.noemi.shopping.shopping.domain.dto.LojaResponse;
import com.noemi.shopping.shopping.service.LojaService;

@RestController
public class LojaController {

	private final LojaService service;
	
	public LojaController(final LojaService service) {
		this.service = service;
	}
	
	
	@GetMapping(value = "api/lojas")
	public ResponseEntity<List<LojaResponse>> getAll(){
		
		var retorno = service.getAll();
		return ResponseEntity.ok(retorno);
	}
	
	@PostMapping(value = "api/lojas")
	public ResponseEntity<LojaResponse> createLoja(@RequestBody @Valid LojaCreateRequest loja){
		
		var lojaResponse = service.createLoja(loja);
		return ResponseEntity.ok(lojaResponse);
		
	}
	
}
