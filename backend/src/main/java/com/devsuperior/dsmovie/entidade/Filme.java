package com.devsuperior.dsmovie.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_filme")
public class Filme {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	
	private Double nota;
	
	private Integer contador;
	
	private String image;
	
	
	public Filme() {
		
	}


	public Filme(Long id, String titulo, Double nota, Integer contador, String image) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.nota = nota;
		this.contador = contador;
		this.image = image;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Double getNota() {
		return nota;
	}


	public void setNota(Double nota) {
		this.nota = nota;
	}


	public Integer getContador() {
		return contador;
	}


	public void setContador(Integer contador) {
		this.contador = contador;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}
	
	
	
}


