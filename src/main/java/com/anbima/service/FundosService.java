package com.anbima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.anbima.dto.RequestAnaliseDados;
import com.anbima.model.Fundo;
import com.anbima.repository.FundosRepository;

@Service
public class FundosService {
	
	@Autowired
	private FundosRepository repository;

	public ResponseEntity<List<Fundo>> getAllFundos(RequestAnaliseDados request) {
		return new ResponseEntity<List<Fundo>>(this.repository.findAll(), HttpStatus.OK);
	}
	
}
