package com.devsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.DTO.FilmeDTO;
import com.devsuperior.dsmovie.DTO.UsuarioDTO;
import com.devsuperior.dsmovie.entidade.Filme;
import com.devsuperior.dsmovie.entidade.Nota;
import com.devsuperior.dsmovie.entidade.Usuario;
import com.devsuperior.dsmovie.repositorios.FilmeRepositorio;
import com.devsuperior.dsmovie.repositorios.NotaRepositorio;
import com.devsuperior.dsmovie.repositorios.UsuarioRepositorio;

@Service
public class UsusarioServico {

	@Autowired
	private FilmeRepositorio filmeRepositorio;

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	@Autowired
	private NotaRepositorio notaRepositorio;

	@Transactional
	public FilmeDTO saveNota(UsuarioDTO usuarioDto) {

		Usuario usuario = usuarioRepositorio.findByEmail(usuarioDto.getEmail());

		if (usuario == null) {
			usuario = new Usuario();
			usuario.setEmail(usuarioDto.getEmail());

			usuario = usuarioRepositorio.save(usuario);
		}

		Filme filme = filmeRepositorio.findById(usuarioDto.getFilmeId()).get();

		Nota nota = new Nota();
		nota.setFilme(filme);
		nota.setUsuario(usuario);
		nota.setNota(usuarioDto.getNota());

		nota = notaRepositorio.saveAndFlush(nota);

		double sum = 0.0;
		for (Nota n : filme.getNotas()) {
			sum = sum + n.getNota();

		}

		double avg = sum / filme.getNotas().size();
		
		filme.setNota(avg);
		filme.setContador(filme.getNotas().size());
		
		filme = filmeRepositorio.save(filme);

		return new FilmeDTO(filme);
	}
}
