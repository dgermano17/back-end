package com.anbima.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fundos")
public class Fundo {

	@Id
	private Long id;
	private String nome;
	
	@Column(name="Impacto")
	private String valorImpacto;
	
	private String descricao;
	
	public Fundo() {
		super();
	}

	public Fundo(Long id, String nome, String valorImpacto, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.valorImpacto = valorImpacto;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValorImpacto() {
		return valorImpacto;
	}

	public void setValorImpacto(String valorImpacto) {
		this.valorImpacto = valorImpacto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
