package com.devsuperior.dsmovie.entidade;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class NotaPK implements Serializable {
	
	

	private static final long serialVersionUID = 1L;


	@ManyToOne
	@JoinColumn (name = "filme_id")
	private Filme filme;
	

	@ManyToOne
	@JoinColumn (name = "usuario_id")
	private Usuario usuario;
	
	
	public NotaPK() {
		
	}


	public Filme getFilme() {
		return filme;
	}


	public void setFilme(Filme filme) {
		this.filme = filme;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
