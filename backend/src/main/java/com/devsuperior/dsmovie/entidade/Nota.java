package com.devsuperior.dsmovie.entidade;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_nota")
public class Nota {
	
	@EmbeddedId
	private NotaPK id = new NotaPK();
	
	private Double nota;

	
	public Nota() {
		
	}

	public void setFilme(Filme filme) {
		id.setFilme(filme);
	}
	
	public void setUsuario (Usuario usuario) {
		id.setUsuario(usuario);
	}

	public NotaPK getId() {
		return id;
	}


	public void setId(NotaPK id) {
		this.id = id;
	}


	public Double getNota() {
		return nota;
	}


	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	
	

}
