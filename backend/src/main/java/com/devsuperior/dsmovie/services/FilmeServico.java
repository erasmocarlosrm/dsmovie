package com.devsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.DTO.FilmeDTO;
import com.devsuperior.dsmovie.entidade.Filme;
import com.devsuperior.dsmovie.repositorios.FilmeRepositorio;

@Service
public class FilmeServico {

	@Autowired
	private FilmeRepositorio filmeRepositorio;

	@Transactional(readOnly = true)
	public Page<FilmeDTO> ListaFilme(Pageable pagina) {
		Page<Filme> resultFilme = filmeRepositorio.findAll(pagina);
		Page<FilmeDTO> page = resultFilme.map(x -> new FilmeDTO(x));
		return page;
	}

	@Transactional(readOnly = true)
	public FilmeDTO buscarID(Long id) {
		Filme resultId = filmeRepositorio.findById(id).get();
		FilmeDTO dtoFilme = new FilmeDTO(resultId);

		return dtoFilme;
	}

}
