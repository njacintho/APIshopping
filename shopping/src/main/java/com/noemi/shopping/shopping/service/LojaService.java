package com.noemi.shopping.shopping.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.noemi.shopping.shopping.domain.dto.LojaCreateRequest;
import com.noemi.shopping.shopping.domain.dto.LojaResponse;
import com.noemi.shopping.shopping.repository.LojaRepository;

@Service
public class LojaService {

	private final LojaRepository repository;

	public LojaService(LojaRepository repository) {
		this.repository = repository;
	}

	public List<LojaResponse> getAll() {
		var retorno = repository.getAll();
		List<LojaResponse> retornoTratado = retorno.stream().map(loja -> new LojaResponse(loja).collect(Collectors.toList()));
		return retornoTratado;
	}

	public Object createLoja(@Valid LojaCreateRequest loja) {
		// TODO Auto-generated method stub
		return null;
	}

}
