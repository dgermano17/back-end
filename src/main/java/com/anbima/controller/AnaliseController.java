package com.anbima.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anbima.model.Fundo;
import com.anbima.service.FundosService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping
public class AnaliseController {
	@Autowired
	FundosService service;

	@GetMapping(value = "/api/v1/analiseFatos")
	public ResponseEntity<List<Fundo>> getAllFundos() {
		return this.service.getAllFundos();
	}

}
