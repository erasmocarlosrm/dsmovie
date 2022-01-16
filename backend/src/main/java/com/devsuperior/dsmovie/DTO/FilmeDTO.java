package com.devsuperior.dsmovie.DTO;

import com.devsuperior.dsmovie.entidade.Filme;

public class FilmeDTO {

	private Long id;

	private String titulo;

	private Double nota;

	private Integer contador;

	private String image;

	public FilmeDTO() {

	}

	public FilmeDTO(Long id, String titulo, Double nota, Integer contador, String image) {

		this.id = id;
		this.titulo = titulo;
		this.nota = nota;
		this.contador = contador;
		this.image = image;
	}

	public FilmeDTO(Filme filme) {

		id = filme.getId();
		titulo = filme.getTitulo();
		nota = filme.getNota();
		contador = filme.getContador();
		image = filme.getImage();
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
