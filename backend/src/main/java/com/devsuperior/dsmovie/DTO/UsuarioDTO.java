package com.devsuperior.dsmovie.DTO;

public class UsuarioDTO {
	
	
	private Long filmeId;
	
	private String email;
	
	private Double nota;
	
	
	
	public UsuarioDTO() {
		
	}



	public Long getFilmeId() {
		return filmeId;
	}



	public void setFilmeId(Long filmeId) {
		this.filmeId = filmeId;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Double getNota() {
		return nota;
	}



	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	

}
