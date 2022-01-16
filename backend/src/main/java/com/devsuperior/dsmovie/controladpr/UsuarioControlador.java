package com.devsuperior.dsmovie.controladpr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.DTO.FilmeDTO;
import com.devsuperior.dsmovie.DTO.UsuarioDTO;
import com.devsuperior.dsmovie.services.UsusarioServico;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioControlador {

	@Autowired
	private UsusarioServico usuarioServico;

	@PutMapping
	public FilmeDTO salvarUsuario(@RequestBody UsuarioDTO  dtoUsuario) {
		FilmeDTO filmedto = usuarioServico.saveNota(dtoUsuario);
		return filmedto;
	}
	
	
}
