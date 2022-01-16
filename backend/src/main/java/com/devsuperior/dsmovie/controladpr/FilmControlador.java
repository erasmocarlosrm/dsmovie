package com.devsuperior.dsmovie.controladpr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.DTO.FilmeDTO;
import com.devsuperior.dsmovie.services.FilmeServico;

@RestController
@RequestMapping(value = "/filmes")
public class FilmControlador {

	
	@Autowired
	public FilmeServico filmeServico;
	
	@GetMapping()
	public Page<FilmeDTO> listarFilme(Pageable pagina){
	 return filmeServico.ListaFilme(pagina);	
		
	}
	@GetMapping(value = "/{id}")
	public FilmeDTO buscarFilmeId(@PathVariable Long id) {
		return filmeServico.buscarID(id);
	}
	
	
}
