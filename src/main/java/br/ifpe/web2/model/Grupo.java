package br.ifpe.web2.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Grupo {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String visibilidade;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dataDeExpiracao;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getVisibilidade() {
		return visibilidade;
	}
	public void setVisibilidade(String visibilidade) {
		this.visibilidade = visibilidade;
	}
	public LocalDate getDataDeExpiracao() {
		return dataDeExpiracao;
	}
	public void setDataDeExpiracao(LocalDate dataDeExpiracao) {
		this.dataDeExpiracao = dataDeExpiracao;
	}
	
	
}
